package exercicios;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        double n1, n2;
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite outro número: ");
        n2 = Double.parseDouble(scanner.nextLine());

        while (opcao != 7) {
            System.out.println("Escolha o que você deseja fazer com esses dois números.");
            System.out.println("""
                    [1] Somar
                    [2] Subtração
                    [3] Multiplicar
                    [4] Dividir
                    [5] Elevar o primeiro numero ao segundo
                    [6] Ver o resto da divisão do primeiro número pelo segundo
                    [7] Sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1 ->{
                    double soma;
                    soma = n1 + n2;
                    System.out.printf("O resultado da soma é %.2f \n", soma);
                }
                case 2 ->{
                    double sub;
                    sub = n1 - n2;
                    System.out.printf("O resultado da subtração é %.2f \n", sub);
                }
                case 3 ->{
                    double mult;
                    mult = n1 * n2;
                    System.out.printf("O resultado da multiplicação é %.2f \n", mult);
                }
                case 4 ->{
                    double div;
                    if (n2 == 0){
                        System.out.println("A divisão não pode ser feita.");
                    }
                    else{
                        div = n1 / n2;
                        System.out.printf("O resultado da divisão é %.2f \n", div);
                    }
                }
                case 5 ->{
                    double potencia;
                    potencia = Math.pow(n1, n2);
                    System.out.printf("O resultado é %.2f \n", potencia);
                }
                case 6 ->{
                    double resto;
                    resto = n1 % n2;
                    System.out.printf("O resultado é %.2f \n", resto);
                }
                case 7 ->{
                    System.out.println("Obrigada!");
                }
            }
            }
        }
    }
