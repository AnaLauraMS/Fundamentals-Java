import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

                int opcao = 0;
                double saldo = 1000.00;
                double deposito = 0;
                double saque = 0;

                while (opcao != 4) {
                    System.out.println("=========================");
                    System.out.println("         BANCO JAVA      ");
                    System.out.println("=========================");

                    System.out.println("1 - Consultar");
                    System.out.println("2 - Depositar");
                    System.out.println("3 - Sacar");
                    System.out.println("4 - Sair");
                    System.out.println("Escolha uma opção: ");
                    opcao = sc.nextInt();

                    if( opcao == 1){
                        System.out.printf("Seu saldo é: R$ %.2f%n", saldo);
                    } else if (opcao == 2) {
                        System.out.println("Digite o valor do depósito: ");
                        deposito = sc.nextDouble();

                        if(deposito > 0){
                            saldo += deposito;
                            System.out.println("Deposito realizado com sucesso!");
                            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                        }else if(opcao <= 0){
                            System.out.println("Opção inválida");
                        }
                    } else if (opcao == 3) {
                        System.out.println("Digite o valor do saque: ");
                        saque = sc.nextDouble();
                        if (saque <= 0) {
                            System.out.println("Valor inválido.");
                        } else if (saque <= saldo) {
                            saldo -= saque;
                            System.out.println("Saque realizado com sucesso!");
                            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else if (opcao == 4) {
                        System.out.println("Saindo do sistema.");
                        System.out.println("Obrigado por escolher nosso Banco!");
                    }else {
                        System.out.println("Valor inválido! Digite uma opção válida: ");
                        opcao = sc.nextInt();
                    }
                }


        sc.close();
        }
    }
