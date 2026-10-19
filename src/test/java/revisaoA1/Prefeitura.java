package revisaoA1;

/*
8.A prefeitura de uma cidade fez uma pesquisa entre
seus habitantes, coletando os dados e armazenando
em vetores os salário e número de filhos.
A prefeitura deseja saber:
- média do salário da população;
- média do número de filhos;
- maior salário;
- percentual de pessoas com salário até R$200,00.
- O final da leitura de dados se dará com a entrada de um salário negativo.
 */


import java.util.Scanner;

public class Prefeitura {
    private static final int POPULACAO = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] salario = new float[POPULACAO];
        int[] filhos = new int[POPULACAO];

        int populacao = 0;

        while (true && populacao < POPULACAO){
            System.out.print("Salário: ");
            float salarioCidadao = scanner.nextFloat();

            if (salarioCidadao < 0 ){
                break;
            }

            salario[populacao] = salarioCidadao;
            System.out.printf("Filhos: ");
            filhos[populacao] = scanner.nextInt();

            populacao++;
        }

        int qtdePessoasSalarioAte200 = 0;
        float somaSalarios = 0f, somaFilhos = 0f,
                maiorSalario = Float.MIN_VALUE;

        for (int pos = 0; pos < populacao; pos++ ){
            if (salario[pos] <= 200.0){
                qtdePessoasSalarioAte200++;
            }

            somaSalarios += salario[pos];
            somaFilhos += filhos[pos];

            if (salario[pos] > maiorSalario){
                maiorSalario = salario[pos];
            }
        }

        System.out.printf("Média do salário da população é %10.2f\n",
                somaSalarios / populacao);
        System.out.printf("Média do número de filhos é %10.2f\n",
                somaFilhos / populacao);
        System.out.printf("Maior salário é %10.2f\n",
                maiorSalario);
        System.out.printf("Percentual de pessoas com salário até R$200,00 é %10.2f%%\n",
                ((float) qtdePessoasSalarioAte200 / (float) populacao) * 100.0);
    }
}
