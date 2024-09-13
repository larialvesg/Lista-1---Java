import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Variaveis da problemática
        double quantiaCarlos = 0;
        String aprovacaoDeAninha = "";
        boolean feriasJoana = false;

//        Variaveis para o controle do programa
        int opcao = 0; // controlar o menu do switch/case
        String continuar = ""; // controla laço de repetição do while

//        Variaveis para a entrada
        Scanner scanner = new Scanner(System.in);

        while (!continuar.equalsIgnoreCase("sair")){ // enquanto a variavel "continuar" for diferente de "sair", o laço continua repetindo
            System.out.println("Qual membro da familia você deseja inserir dados? ");
            System.out.println("""
                    [1] Carlos
                    [2] Joana
                    [3] Aninha
                    [4] Exibir Situação
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1 ->{
                    try {

                        System.out.print("Qual a quantia que o Carlos conseguiu juntar?");
                        quantiaCarlos = Double.parseDouble(scanner.nextLine());
                        continue;
                    }catch (NumberFormatException e){
                        System.out.println("Você digitou caracteres inválidos, digite novamente: ");
                        continue;
                    }
                }
                case 2 ->{
                    System.out.println("Joana conseguiu tirar férias? Digite sim ou não");
                    feriasJoana = scanner.nextLine().equalsIgnoreCase("sim");
                    continue;
                }
                case 3 ->{
                    System.out.println("Aninha foi aprovada na escola? Digite aprovada ou reprovada");
                    aprovacaoDeAninha = scanner.nextLine();
                    continue;
                }
                case 4 ->{
                    if (quantiaCarlos >= 8000 && aprovacaoDeAninha.equalsIgnoreCase("aprovada") && feriasJoana) {
                        System.out.println("A familia poderá viajar");
                    }
                    else if (quantiaCarlos < 8000 && aprovacaoDeAninha.equalsIgnoreCase("aprovada") && feriasJoana){
                        System.out.println("Carlos não conseguiu juntar a quantia");
                    }
                    else if (quantiaCarlos >= 8000 && aprovacaoDeAninha.equalsIgnoreCase("aprovada") && !feriasJoana){
                        System.out.println("Joana não conseguiu tirar férias");
                    }
                    else if (quantiaCarlos >= 8000 && aprovacaoDeAninha.equalsIgnoreCase("reprovada") && feriasJoana){
                        System.out.println("Aninha não foi aprovada");
                    }
                    else{
                        System.out.println("Dois ou mais critérios não foram atingidos");
                    }
                    }

            }

            System.out.println("Deseja continuar ou sair do programa?");
            continuar = scanner.nextLine();
        }
    }
}

