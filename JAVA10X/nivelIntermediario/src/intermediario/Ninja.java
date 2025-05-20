package intermediario;

public class Ninja {
    // 🔹 Atributos do Ninja (características)
    String nome;
    String aldeia;
    int idade;

    // 🔹 Métodos (ações que o Ninja pode fazer)

    public void SharinganAtivado() {
        System.out.println("O Sharingan foi ativado!");
    }

    public void RasenganAtaque() {
        System.out.println("RASENGAN!");
    }

    public void EstrangulamentoDasSombras() {
        System.out.println("Jutsu: Estrangulamento das Sombras!");
    }

    // Método que retorna uma mensagem
    public String EuSouUmNinja() {
        return "Oi, eu sou um ninja!";
    }

    // Método que calcula quantos anos faltam para virar Hokage
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
