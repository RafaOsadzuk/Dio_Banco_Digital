
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        Conta contaAtual = null;

        while (true) {
            System.out.println("Escolha a sua conta:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - finalizar");

            int contaEscolha = scanner.nextInt();

            switch (contaEscolha) {
                case 1:
                    contaAtual = cc;
                    break;

                case 2:
                    contaAtual = cp;
                    break;
                case 3:
                    System.out.println("Programa finalizado");
                    return;

                default:
                    System.out.println("Opção inválida");
                    continue;
            }

            while (true) {
                System.out.println("=== BEM VINDO A CONTA " + contaAtual);
                System.out.println("Escolha a operação:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Imprimir Extrato");
                System.out.println("4 - Voltar");

                int operacao = scanner.nextInt();

                switch (operacao) {
                    case 1:
                        System.out.println("Digite o valor a ser depositado:");
                        double valorDeposito = scanner.nextDouble();
                        contaAtual.depositar(valorDeposito);
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser sacado:");
                        double valorSaque = scanner.nextDouble();
                        contaAtual.sacar(valorSaque);
                        break;
                    case 3:
                        contaAtual.imprimirExtrato();
                        break;
                    case 4:
                        contaAtual = null;
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                if(contaAtual == null){
                    break;
                }
            }
        }
    }
}