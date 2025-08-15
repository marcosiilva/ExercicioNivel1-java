package Sequential;

import java.util.Locale;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("=== Calcular Área do Retângulo ===");
        System.out.print("Digite o valor da base do retangulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura do retangulo: ");
        double altura = sc.nextDouble();

        //Calculo
        double area = base * altura;

        //Saida
        System.out.printf("A area do retângulo é: %.2f", area);
        System.out.println("=== Fim do Programa ===");
        sc.close();

    }
}
