package revisaoA1;

import java.util.Locale;
import java.util.Random;

/**
 * Exercício 8 - Pesquisa de habitantes (leitura automática e aleatória).
 *
 * A prefeitura de uma cidade fez uma pesquisa entre seus habitantes,
 * coletando os dados e armazenando em vetores os salários e o número
 * de filhos. O programa calcula:
 *
 *  - média do salário da população;
 *  - média do número de filhos;
 *  - maior salário;
 *  - percentual de pessoas com salário até R$ 200,00.
 *
 * Os dados são gerados automaticamente pelo programa (sem digitação).
 * A leitura termina quando um salário negativo é gerado.
 */
public class PesquisaHabitantes {

    /** Capacidade máxima dos vetores de armazenamento. */
    private static final int MAX_HABITANTES = 100;

    /** Quantidade mínima de habitantes antes de permitir o encerramento. */
    private static final int MINIMO_HABITANTES = 5;

    /** Valor máximo de salário que pode ser gerado (R$). */
    private static final double SALARIO_MAXIMO = 3000.00;

    /** Quantidade máxima de filhos que pode ser gerada. */
    private static final int MAX_FILHOS = 7;

    /** Chance de o próximo salário gerado ser negativo (encerra a leitura). */
    private static final double PROBABILIDADE_ENCERRAR = 0.08;

    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));
        Random random = new Random();

        double[] salarios = new double[MAX_HABITANTES];
        int[] filhos = new int[MAX_HABITANTES];
        int totalHabitantes = 0;

        System.out.println("==============================================");
        System.out.println("     PESQUISA DE HABITANTES - PREFEITURA");
        System.out.println("==============================================");
        System.out.println("Leitura AUTOMÁTICA: os dados são gerados aleatoriamente.");
        System.out.println("A leitura termina quando um salário negativo é gerado.");
        System.out.println();

        while (totalHabitantes < MAX_HABITANTES) {
            // Após o mínimo de habitantes, pode ser gerado um salário negativo.
            boolean encerrarLeitura = totalHabitantes >= MINIMO_HABITANTES
                    && random.nextDouble() < PROBABILIDADE_ENCERRAR;

            double salario = encerrarLeitura ? -1.00 : gerarSalario(random);

            if (salario < 0) {
                System.out.printf("Salário gerado: R$ %.2f  ->  salário negativo, encerrando a leitura.%n", salario);
                break;
            }

            int numeroFilhos = random.nextInt(MAX_FILHOS + 1);

            salarios[totalHabitantes] = salario;
            filhos[totalHabitantes] = numeroFilhos;
            totalHabitantes++;

            System.out.printf("Habitante %2d -> Salário: R$ %8.2f | Filhos: %d%n",
                    totalHabitantes, salario, numeroFilhos);
        }

        if (totalHabitantes == 0) {
            System.out.println("\nNenhum dado foi gerado. Encerrando o programa.");
            return;
        }

        double somaSalarios = 0.0;
        int somaFilhos = 0;
        double maiorSalario = salarios[0];
        int pessoasAteDuzentos = 0;

        for (int i = 0; i < totalHabitantes; i++) {
            somaSalarios += salarios[i];
            somaFilhos += filhos[i];

            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }

            if (salarios[i] <= 200.00) {
                pessoasAteDuzentos++;
            }
        }

        double mediaSalario = somaSalarios / totalHabitantes;
        double mediaFilhos = (double) somaFilhos / totalHabitantes;
        double percentualAteDuzentos = (pessoasAteDuzentos * 100.0) / totalHabitantes;

        System.out.println();
        System.out.println("============ RESULTADO DA PESQUISA ============");
        System.out.printf("Habitantes entrevistados......: %d%n", totalHabitantes);
        System.out.printf("Média do salário..............: R$ %.2f%n", mediaSalario);
        System.out.printf("Média do número de filhos.....: %.2f%n", mediaFilhos);
        System.out.printf("Maior salário.................: R$ %.2f%n", maiorSalario);
        System.out.printf("Salário até R$ 200,00.........: %.2f%% (%d pessoa(s))%n",
                percentualAteDuzentos, pessoasAteDuzentos);
        System.out.println("===============================================");
    }

    /**
     * Gera um salário aleatório entre R$ 0,00 e o salário máximo definido.
     * O valor é arredondado para duas casas decimais.
     */
    private static double gerarSalario(Random random) {
        double valor = random.nextDouble() * SALARIO_MAXIMO;
        return Math.round(valor * 100.0) / 100.0;
    }
}
