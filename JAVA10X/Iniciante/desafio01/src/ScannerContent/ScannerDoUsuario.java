// Define o pacote onde essa classe está localizada
package ScannerContent;

// Importa a classe Scanner do pacote java.util, necessária para receber dados do usuário
import java.util.Scanner;

// Classe principal que contém o método main
public class ScannerDoUsuario {
    public static void main(String[] args) {

        // Cria um Scanner chamado 'caixaDeTexto' para ler entradas do usuário via console
        Scanner caixaDeTexto = new Scanner(System.in);

        // Solicita que o usuário digite o nome do ninja
        System.out.println("escreva aqui o nome do ninja: ");

        // Lê a linha digitada e armazena na variável 'nomeDoNinja'
        String nomeDoNinja = caixaDeTexto.nextLine();

        // Imprime o nome do ninja em letras maiúsculas
        System.out.println("o nome do ninja é: " + nomeDoNinja.toUpperCase());

        // Cria outro Scanner para ler a idade do ninja
        Scanner caixaDeIdade = new Scanner(System.in);

        // Solicita que o usuário digite a idade do ninja
        System.out.println("escreva aqui a idade do ninja: ");

        // Lê a idade como um número inteiro
        int idadeDoNinja = caixaDeIdade.nextInt();

        // Exibe a idade do ninja no console
        System.out.println("a idade do ninja é: " + idadeDoNinja);

        // Tratamento simples para verificar se o ninja é maior de idade
        if (idadeDoNinja > 18) {
            System.out.println("o ninja é maior de idade.");
        } else {
            System.out.println("o ninja é juvenil -18");
        }

        // Boa prática: sempre fechar o Scanner após o uso para liberar o recurso
        caixaDeTexto.close();
        caixaDeIdade.close(); // Também é importante fechar este Scanner

        // OBS: O método nextLine() é útil quando queremos ler uma String completa do usuário
    }
}
