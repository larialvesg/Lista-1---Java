package exercicios;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args){
        double n1, n2;
        double p1 = 40;
        double p2 = 60;
        double resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a segunda nota: ");
        n2 = scanner.nextDouble();
        scanner.nextLine();

        resultado = ((n1 * p1) + (n2 * p2)) / (p1 + p2);

        System.out.printf("Sua média ponderada é %.2f", resultado);
    }
}
