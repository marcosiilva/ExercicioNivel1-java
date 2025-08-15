package Sequential;

import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("=== Calculadora de Soma Simples ===");
        System.out.print("Digite o primeiro número: ");
        int number1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int number2 = sc.nextInt();

        //Calculo
        int total = number1 + number2;

        //Saída
        System.out.println("A soma de " + number1 + " e " + number2 + " é: " + total);
        System.out.println("=== Fim do Programa ===");

        sc.close();
    }
}
