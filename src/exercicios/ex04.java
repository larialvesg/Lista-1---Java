package exercicios;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        int numero, antecessor, sucessor = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("O número digitado foi o %d, seu antecessor é o %d e o seu sucessor é o %d", numero, antecessor, sucessor);

    }
}
