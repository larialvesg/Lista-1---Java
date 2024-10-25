package exercicios;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        double representantes = 0.20;
        double impostos = 0.30;
        double valor_compra, result_reps, result_impostos, valor_final = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de compra: ");
        valor_compra = scanner.nextDouble();
        scanner.nextLine();

        result_reps = representantes * valor_compra;
        result_impostos = impostos * valor_compra;

        valor_final = result_impostos + result_reps + valor_compra;
        System.out.printf("O valor dos impostos é %.2f e o valor dos representantes é %.2f \n", result_impostos, result_reps);
        System.out.printf("O valor de venda é %.2f \n", valor_final);



    }
}
