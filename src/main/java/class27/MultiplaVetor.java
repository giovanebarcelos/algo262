package class27;

/*
1. Faça um algoritmo que armazena 1000 números
 em um vetor e outros 1000 em outro vetor e
 calcule a multiplicação entre os dois números
 de mesmo índice, sem utilizar o sinal de
 multiplicação ( * ) ou função.
  Utilize estrutura de repetição e soma.
 */

import java.util.Random;

public class MultiplaVetor {
    private static final int SIZE = 1000;

    public static void main(String[] args) {
        int[] vetorA = new int[SIZE];
        int[] vetorB = new int[SIZE];
        int[] vetorC = new int[SIZE];
        Random random = new Random();

        for (int pos = 0; pos < SIZE; pos++) {
            vetorA[pos] =
                    random.nextInt(95) + 1;
            vetorB[pos] =
                    random.nextInt(95) + 1;

            vetorC[pos] = multiplicar(vetorA[pos],
                    vetorB[pos]);

            System.out.printf("\n%d) %d x %d = %d",
                    pos, vetorA[pos], vetorB[pos],
                    vetorC[pos]);
        }
    }

    private static int multiplicar(int numA, int numB) {
        int sum = 0;
        while (numA > 0) {
            sum += numB;
            numA--;
        }
        return sum;
    }
}
