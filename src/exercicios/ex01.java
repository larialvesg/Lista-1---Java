package exercicios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        String nome, sobrenome, data_nasc, grau_escolar, cargo;
        double salario = 0;
        boolean cnh;
        String cnh_opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo! Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        data_nasc = scanner.nextLine();

        System.out.println("Digite sua pretensão salarial: ");
        salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o cargo pretendido: ");
        cargo = scanner.nextLine();

        System.out.println("Digite sua escolaridade: ");
        grau_escolar = scanner.nextLine();

        System.out.println("Você possui CNH do tipo B? Responda com sim ou não:");
        cnh_opcao = scanner.nextLine();


        System.out.println("Seus dados foram cadastrados com sucesso! Segue as suas informações:");
        System.out.println("Nome: " + nome + " " + sobrenome + "\nData de nascimento: " + data_nasc + "\nPretensão Salarial: " + salario + "\nEscolaridade: " + grau_escolar +  "\nCargo desejado: " + cargo);
        if (cnh_opcao.equalsIgnoreCase( "sim")) {
            cnh = true;
            System.out.print("Você possui CNH do tipo B");
        }
        else{
            cnh = false;
            System.out.print("Você não possui CNH do tipo B");
        }
        scanner.close();
        }


    }

