package Array;

// Classe principal que demonstra o uso de um array bidimensional (matriz)
public class Array2d {

    public static void main(String[] args) {
        // Criando um array bidimensional 3x3 para armazenar aldeias e ninjas
        String[][] ninjasEAldeias = new String[3][3]; // 3 linhas e 3 colunas

        // Preenchendo a primeira linha da matriz com a aldeia e dois ninjas
        ninjasEAldeias[0][0] = "Konaha";   // Aldeia
        ninjasEAldeias[0][1] = "Naruto";   // Ninja 1
        ninjasEAldeias[0][2] = "Sasuke";   // Ninja 2

        // Segunda linha com outra aldeia e dois ninjas
        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        // Terceira linha com mais uma aldeia e dois ninjas
        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        // Loop para percorrer cada linha da matriz
        for (int i = 0; i < ninjasEAldeias.length; i++) {
            // Exibindo apenas o ninja que está na coluna 1 de cada linha (índice 1)
            // Ou seja, o primeiro ninja associado a cada aldeia
            System.out.println(ninjasEAldeias[i][1]);
        }
    }
}
