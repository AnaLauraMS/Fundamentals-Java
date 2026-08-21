import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 7;
        int tentativa = 0;

        while (tentativa != numeroSecreto) {

            System.out.print("Digite um número de 0 a 10: ");
            tentativa = sc.nextInt();

            if (tentativa < numeroSecreto) {

                System.out.println("Tente um número maior.");

            } else if (tentativa > numeroSecreto) {

                System.out.println("Tente um número menor.");

            } else {

                System.out.println("Parabéns! Você acertou!");

            }
        }

        sc.close();
    }
}