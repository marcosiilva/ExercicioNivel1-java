package Sequential;

import java.util.Locale;
import java.util.Scanner;

public class MediaCalculator {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("=== Calculadora de Média ===");
        System.out.print("Digite sua primeira nota: ");
        double grade1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double grade2 = sc.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        double grade3 = sc.nextDouble();

        //Calculo
        double average = (grade1 + grade2 + grade3) / 3;

        //Saida
        System.out.printf("Sua média foi: %.2f%n", average);
        System.out.println("=== Fim do Programa ===");

        sc.close();


    }
}
