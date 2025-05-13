import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (saldo >= valor) {
			historico.add("Saque de R$" + valor);
		} else {
			System.err.println("Saldo insuficiente para saque de R$" + valor);
		}
		
	}

	@Override
	public void depositar(double valor) {
    	saldo += valor;
    	historico.add("Depósito de R$ " + valor);
}


	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			historico.add("Transferência de R$" + valor);
		} else {
			System.err.println("Saldo insuficiente para transferência de R$" + valor);
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected List<String> historico = new ArrayList<>();

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));

		System.out.println("--- Histórico de Transações ---");
		if (historico.isEmpty()) {
			System.out.println("Nenhuma movimentação resgistrada.");
		} else {
			for (String registro : historico){
				System.out.println(registro);
			}
		}
	}


}
