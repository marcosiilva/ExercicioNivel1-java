package Sequential;

import java.util.Locale;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("=== Conversor de Temperatura ===");
        System.out.print("Digite a temperatura em Celsius: ");
        double temperatureCelsius = sc.nextDouble();

        //Calculo
        double temperatureFahrenheit = (9 * temperatureCelsius / 5) + 32;

        //Saída
        System.out.printf("%.2f°C em Fahrenheit é: %.2f°F",  temperatureCelsius, temperatureFahrenheit);
        System.out.println("=== Fim do Programa ===");

        sc.close();
    }
}
