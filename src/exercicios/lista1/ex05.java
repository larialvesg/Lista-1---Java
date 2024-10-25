package exercicios;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args){
        int horas, minutos, segundos, tempo_final = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas: ");
        horas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a quantidade de minutos: ");
        minutos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a quantidade de segundos: ");
        segundos = scanner.nextInt();
        scanner.nextLine();

        tempo_final = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.printf("Esse horário em segundos dá %d segundos", tempo_final);


    }
}
