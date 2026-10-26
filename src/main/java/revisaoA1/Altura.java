package revisaoA1;

/*
Escrever um algoritmo que armazene vetores num conjunto de 5 informações
contendo cada uma delas altura e sexo de uma pessoa.
Um 1 para masculino e 2 para feminino.
Calcule e mostre o seguinte:
- a maior e menor altura da turma
- a média da altura das mulheres
- a média da altura da turma
 */

import java.util.Scanner;

public class Altura {
    private static final int QTDE_PESSOAS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sexo = new int[QTDE_PESSOAS];
        float[] altura = new float[QTDE_PESSOAS];

        for (int pos = 0; pos < QTDE_PESSOAS; pos++){
            System.out.printf("%d) Sexo (1=Masculino/2=Feminino): ",
                    pos+1);
            sexo[pos] = scanner.nextInt();
            System.out.print("Altura (m): ");
            float alturaPessoa = scanner.nextFloat();

            altura[pos] = alturaPessoa;
        }

        // Estatísticas
        int qtdeMulheres = 0;
        float somaAlturaMulheres = 0f,
                somaAlturaTurma = 0f,
                maiorAltura = Float.MIN_NORMAL,
                menorAltura = Float.MAX_VALUE;

        for (int pos = 0; pos < QTDE_PESSOAS; pos++) {
            if ( altura[pos] > maiorAltura ) {
                maiorAltura = altura[pos];
            }

            if ( altura[pos] < menorAltura ) {
                menorAltura = altura[pos];
            }

            if (sexo[pos] == 2){ // Mulheres
                qtdeMulheres++;
                somaAlturaMulheres += altura[pos];
            }

            somaAlturaTurma += altura[pos];
        }

        System.out.printf("Maior altura da turma é %10.2f\n",
                maiorAltura);
        System.out.printf("Menor altura da turma é %10.2f\n",
                menorAltura);
        System.out.printf("Média da altura das mulheres é %10.2f\n",
                somaAlturaMulheres / qtdeMulheres );
        System.out.printf("Média da altura da turma é %10.2f\n",
                somaAlturaTurma / QTDE_PESSOAS );
    }
}
