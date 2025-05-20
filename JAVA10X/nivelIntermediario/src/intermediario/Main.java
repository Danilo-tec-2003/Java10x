package intermediario;

public class Main {
    public static void main(String[] args) {

        // 🔹 EXEMPLO USANDO VARIÁVEIS COMUNS (sem orientação a objetos)
        String nomeNaruto = "Naruto";
        int idadeNaruto = 18;
        String aldeiaNaruto = "Aldeia da Folha";

        //System.out.println("O nome do Ninja é " + nomeNaruto);

        // 🔹 ORIENTAÇÃO A OBJETOS EM AÇÃO
        // Criando instâncias (objetos) da classe Ninja

        // ➤ Criando Ninja 1 - Sasuke
        Ninja sasuke = new Ninja(); // Instancia um novo Ninja
        sasuke.nome = "Sasuke";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

        // Usando métodos do objeto Sasuke
        sasuke.SharinganAtivado(); // Método sem retorno (void)
        String fraseNinja = sasuke.EuSouUmNinja(); // Método com retorno
        System.out.println(fraseNinja);

        // Método que calcula quanto tempo falta para virar Hokage
        int idadeMinima = 70;
        int anosRestantes = sasuke.anosParaSeTornarHokage(idadeMinima);
        System.out.println("Você tem " + sasuke.idade + " anos, então faltam " + anosRestantes + " anos para se tornar Hokage.");

        // ➤ Criando Ninja 2 - Shikamaru
        Ninja shikamaru = new Ninja();
        shikamaru.nome = "Shikamaru";
        shikamaru.idade = 20;
        shikamaru.aldeia = "Aldeia da Folha";

        //shikamaru.EstrangulamentoDasSombras(); // você pode ativar esse método depois

        // ➤ Criando Ninja 3 - Naruto
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto";
        naruto.idade = 15;
        naruto.aldeia = "Aldeia da Folha";

        //naruto.RasenganAtaque(); // você pode ativar esse método depois

        // 🔹 Mostrando os dados dos ninjas criados
        System.out.println("\n--- Dados dos Ninjas Criados ---");
        System.out.println("Nome: " + sasuke.nome + ", Idade: " + sasuke.idade + ", Aldeia: " + sasuke.aldeia);
        System.out.println("Nome: " + shikamaru.nome + ", Idade: " + shikamaru.idade + ", Aldeia: " + shikamaru.aldeia);
        System.out.println("Nome: " + naruto.nome + ", Idade: " + naruto.idade + ", Aldeia: " + naruto.aldeia);
    }
}
