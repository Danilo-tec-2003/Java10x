
package Array;

import java.util.Arrays;

public class ArrayContent {

    public static void main(String[] args) {

        /* ------------------------- 1) Primeiro array ------------------------- */

        // Cria um vetor de 6 posições (índices 0 a 5)
        String[] ninjas = new String[6];

        // Preenche só as cinco primeiras posições
        ninjas[0] = "Naruto";
        ninjas[1] = "Shikamaru";
        ninjas[2] = "Kakashi";
        ninjas[3] = "Rock Lee";
        ninjas[4] = "Sakura";

        // Índice 5 não foi preenchido → imprime null
        System.out.println(ninjas[5]);

        /* ------------------------ 2) Redeclarando o array --------------------- */

        // Ao criar um novo array você PERDE a referência ao antigo
        ninjas = new String[] {
                "Hashirama",
                "Tobirama",
                "Sarutobi",
                "Minato",
                "Tsunade",   // corrige “Tsunada”
                "Kakashi",
                "Naruto"
        };

        // Agora a posição 5 contém “Kakashi”
        System.out.println(ninjas[5]);

        /* ------------------------- 3) Impressão elegante ---------------------- */

        // a) for‑each → evita “números mágicos” e torna o código mais limpo
        for (String ninja : ninjas) {
            System.out.println(ninja);
        }

        // b) Se quiser ver o array inteiro em uma linha:
        System.out.println(Arrays.toString(ninjas));
    }
}
