package condicionais;

import java.util.Scanner;

public class SwitchContent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolhaDoUsuario;

        do {
            // Exibe as opções ao usuário
            System.out.println("\nEscolha um Ninja:");
            System.out.println("1 - Naruto");
            System.out.println("2 - Shikamaru");
            System.out.println("3 - Kakashi");
            System.out.println("0 - Sair");

            // Lê a entrada do usuário
            System.out.print("Digite sua escolha: ");
            escolhaDoUsuario = scanner.nextInt();

            // Estrutura switch para tratar a escolha
            switch (escolhaDoUsuario) {
                case 1:
                    System.out.println("O usuário escolheu o Naruto");
                    break;
                case 2:
                    System.out.println("O usuário escolheu o Shikamaru");
                    break;
                case 3:
                    System.out.println("O usuário escolheu o Kakashi");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Digite um número válido (0, 1, 2, 3)");
            }

        } while (escolhaDoUsuario != 0); // Repete até o usuário escolher sair

        scanner.close(); // Fecha o scanner
    }
}
