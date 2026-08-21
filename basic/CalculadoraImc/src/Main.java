import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);


        System.out.println("CALCULADORA DE IMC");
        System.out.println("Informe seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso ideal");
        } else if (imc <= 24.5) {
            System.out.println("Peso normal");
        }else if (imc <= 29.9) {
            System.out.println("Pré-obesidade");
        }else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        }else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        }else {
            System.out.println("Obesidade Grave");
        }

        sc.close();
     }

    }