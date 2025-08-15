package Sequential;

import java.util.Locale;
import java.util.Scanner;

public class MinuteConverterForHour {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("=== Conversor de Minutos para Horas === ");
        System.out.print("Digite o valor em minutos: ");
        double minutes = sc.nextDouble();

        //Calculo
        double hours = minutes / 60;

        //Saida
        System.out.printf("%.2f minutos equivalem a: %.2f horas", minutes, hours);
        System.out.println("=== Fim do Programa ===");
        sc.close();

    }
}
