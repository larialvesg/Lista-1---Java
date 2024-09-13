package exercicios;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args){
        double salario = 1500;
        double comissao;
        double porcent = 0.0001;
        double n_carros;
        double total_vendas;
        double vendas, salario_total;
        String nome, mes;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        nome = scanner.nextLine();

        System.out.println("Digite o mês: ");
        mes = scanner.nextLine();

        System.out.println("Digite o número de carros que ele vendeu: ");
        n_carros = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o número total de vendas: ");
        total_vendas = scanner.nextDouble();
        scanner.nextLine();

        comissao = n_carros * 350;
        vendas = total_vendas + (porcent * total_vendas);
        salario_total = comissao + vendas + salario;

        System.out.printf("Seu nome é %s\n", nome);
        System.out.printf("O mês é %s\n", mes);
        System.out.printf("A comissão dele foi de %.2f\n", comissao);
        System.out.printf("O total de vendas foi de %.2f\n", vendas);
        System.out.printf("Seu salário total foi de %.2f\n", salario_total);





    }
}
