package desafio2;

import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Criando o array para armazenar os nomes dos ninjas
        String[] ninjas = new String[10];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            // MENU
            System.out.println("====== Menu Ninja ========");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o nextInt

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < 10) {
                        System.out.print("Digite o nome do Ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja; // Armazena o nome no array
                        ninjasCadastrados++; // Incrementa o contador
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista de ninjas está cheia. Impossível cadastrar um novo ninja.");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado!");
                    } else {
                        System.out.println("====== Lista de ninjas ========");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]); // Exibe o nome corretamente
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos terminando o programa... Aguarde.");
                    break;

                default:
                    System.out.println("Essa opção não é válida.");
                    break;
            }
        }

        scanner.close(); // Boa prática: fechar o scanner ao final
    }
}
