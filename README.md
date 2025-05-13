# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

## Alterações feitas

Operações bancárias:
Criar cliente e contas automaticamente ao iniciar o programa

Depositar em conta corrente

Sacar de conta corrente (com validação de saldo)

Transferir da conta corrente para a conta poupança (com validação de saldo)

Consultar extrato da conta corrente ou poupança

## Histórico de transações:
Cada operação (depósito, saque, transferência ou recebimento) é registrada no histórico da conta, exibido no extrato com detalhes.

## Exemplo de saída do extrato:
ruby
Copiar
Editar
Titular: Matheus
Agência: 1
Número: 1001
Saldo: R$ 350.00
--- Histórico de Transações ---
Depósito de R$ 500.0
Saque de R$ 150.0
Transferência de R$ 100.0 para João
Recebimento de R$ 100.0 de Ana


## Validações incluídas
❌ Saque maior que o saldo não é permitido

❌ Transferência maior que o saldo não é permitida


## ▶️ Como executar
Compile os arquivos .java

Rode a classe Main

Interaja com o menu no terminal