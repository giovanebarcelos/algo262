package class27;
/*
   Solução Algoritmo https://projecteuler.net/problem=3
   The prime factors of 13195 are 5, 7, 13, and 20.
   What is the largest prime factor of the number 600851475143?
 */
public class LargestPrimeFactor {
    private static final long MAXNUM = 13195;
    private static int posPrimo = -1;
    private static long[] primos = new long[10000];
    public static void main(String[] args) {
        for (long num = 1; num <= MAXNUM; num++){
            if (ehPrimeFactor(num)){
                posPrimo++;
                primos[posPrimo] = num;
            }
        }

        System.out.printf("Máximo Fator Primo de %d é %d",
                MAXNUM, primos[posPrimo]);

        float mediaPrimos = mediaPrimos(primos);

        System.out.printf("\nMédia de Primos é %10.2f",
                mediaPrimos);
    }

    private static float mediaPrimos(long[] primos){
        int pos = 0, countPrimo = 0;
        long sumPrimo = 0;

        while (pos < primos.length){
            if (primos[pos] > 0){
                sumPrimo += primos[pos];
                countPrimo++;
            } else {
                return (float) sumPrimo / (float) countPrimo;
            }
            pos++;
        }

        return 0;
    }

    private static boolean ehPrimeFactor(long num){
        if (ehPrime(num)){
            return MAXNUM % num == 0;
        } else {
            return false;
        }
    }

    private static boolean ehPrime(long num) {
        int countDiv = 0;
        for (long divider = 1; divider <= num; divider++){
            if (num % divider == 0){
                countDiv++;
            }
        }

        return countDiv == 2;
    }
}
