import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Cadastro do clinte
		System.out.print("Digite seu nome para cadastro:");
		String nome = scanner.nextLine();
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		
		// tipo de conta
		ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente);

		int opcao;
		do { 
			System.out.println("\n=========== MENU ===========");
            System.out.println("1. Depositar na Conta Corrente");
            System.out.println("2. Sacar da Conta Corrente");
            System.out.println("3. Transferir para Conta Poupança");
            System.out.println("4. Ver extrato Conta Corrente");
            System.out.println("5. Ver extrato Conta Poupança");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
			opcao = scanner.nextInt();

			switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    cc.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso.");
                    break;

                case 2:
                    System.out.print("Valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                    cc.sacar(saque);
					System.out.println("Saque realizado.");
                    break;

                case 3:
                    System.out.print("Valor da transferência: R$ ");
                    double transferencia = scanner.nextDouble();
                    cc.transferir(transferencia, cp);
					System.out.println("Transferência realizada");
                    break;

                case 4:
                    cc.imprimirExtrato();
                    break;

                case 5:
                    cp.imprimirExtrato();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

		} while (opcao !=0);

		scanner.close();
	}

}
