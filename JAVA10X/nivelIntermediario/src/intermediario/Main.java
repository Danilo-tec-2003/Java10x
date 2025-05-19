package intermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VARIÁVEIS SIMPLES (sem orientação a objetos ainda)
        String nomeNaruto = "Naruto";
        int idadeNaruto = 18;
        String aldeiaNaruto = "Aldeia da Folha";

        System.out.println("O nome do Ninja é " + nomeNaruto);

        // -----------------------------
        // ORIENTAÇÃO A OBJETOS EM AÇÃO
        // Criando instâncias da classe Ninja
        // -----------------------------

        // Criando Ninja 1 - Sasuke
        Ninja sasuke = new Ninja(); // Criando um novo objeto da classe Ninja
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

        // Criando Ninja 2 - Shikamaru
        Ninja shikamaru = new Ninja();
        shikamaru.nome = "Shikamaru";
        shikamaru.idade = 20;
        shikamaru.aldeia = "Aldeia da Folha";

        // Criando Ninja 3 - Naruto (objeto, diferente do primeiro bloco que eram apenas variáveis)
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.idade = 15;
        naruto.aldeia = "Aldeia da Folha";

        // Exibindo os dados dos ninjas criados com objetos
        System.out.println("\n--- Dados dos Ninjas Criados ---");
        System.out.println("Nome: " + sasuke.nome + ", Idade: " + sasuke.idade + ", Aldeia: " + sasuke.aldeia);
        System.out.println("Nome: " + shikamaru.nome + ", Idade: " + shikamaru.idade + ", Aldeia: " + shikamaru.aldeia);
        System.out.println("Nome: " + naruto.nome + ", Idade: " + naruto.idade + ", Aldeia: " + naruto.aldeia);
    }
}
