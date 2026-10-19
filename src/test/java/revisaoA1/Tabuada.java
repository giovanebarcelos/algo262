package revisaoA1;

/*
6.Escrever um algoritmo que leia 2000 valores
para uma variável n e, para cada um deles,
calcule a multiplicação.
Armazene cada resultado em um vetor.
Mostre a tabuada na forma:
1 x n = n
2 x n = 2n
3 x n = 3n

 */

import java.util.Scanner;

public class Tabuada {
    private static final int QTDE_NUMEROS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int num = 0; num < QTDE_NUMEROS; num++) {
            System.out.print("Número inteiro: ");
            int numero = scanner.nextInt();

            int[] tabuada = new int[11];

            for (int pos = 0; pos < tabuada.length; pos++) {
                tabuada[pos] = numero * pos;
            }

            int pos = 0;
            while (pos < tabuada.length) {
                System.out.printf("%d x %d = %d\n",
                        numero, pos, numero * pos);
                pos++;
            }
        }
    }
}