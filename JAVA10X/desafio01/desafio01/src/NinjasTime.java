public class NinjasTime {

    public static void main(String[] args) {

        // Ninja 1 - Naruto
        String nomeNinja1 = "Naruto";
        int idade1 = 10;
        String missao1 = "explorar a aldeia";
        String statusMissao1 = "Em andamento";
        char nivelMissao1 = 'A';

        if (idade1 < 15 && (nivelMissao1 == 'A' || nivelMissao1 == 'B')) {
            statusMissao1 = "Não concluída, idade insuficiente.";
        } else {
            statusMissao1 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade1);
        System.out.println("Missão: " + missao1);
        System.out.println("Nível da missão: " + nivelMissao1);
        System.out.println("Status da missão: " + statusMissao1);
        System.out.println("___________________________________");


        // Ninja 2 - Shikamaru
        String nomeNinja2 = "Shikamaru";
        int idade2 = 16;
        String missao2 = "conhecer jutsus";
        String statusMissao2 = "Em andamento";
        char nivelMissao2 = 'E';

        if (idade2 < 15 && (nivelMissao2 == 'A' || nivelMissao2 == 'B')) {
            statusMissao2 = "Não concluída, idade insuficiente.";
        } else {
            statusMissao2 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Nível da missão: " + nivelMissao2);
        System.out.println("Status da missão: " + statusMissao2);
        System.out.println("___________________________________");


        // Ninja 3 - Kakashi
        String nomeNinja3 = "Kakashi";
        int idade3 = 25;
        String missao3 = "supervisionar classe de ninjas";
        String statusMissao3 = "Em andamento";
        char nivelMissao3 = 'S';

        if (idade3 < 15 && (nivelMissao3 == 'A' || nivelMissao3 == 'B')) {
            statusMissao3 = "Não concluída, idade insuficiente.";
        } else {
            statusMissao3 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Nível da missão: " + nivelMissao3);
        System.out.println("Status da missão: " + statusMissao3);
        System.out.println("___________________________________");
    }
}
