package class27;

import java.math.BigDecimal;
import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        math();
    }

    private static void math() {
        Scanner scanner = new Scanner(System.in);

        int choose = 0;
        do {
            menu();
            choose = getOption();

            if (choose != 9) {
                System.out.print("Número 1: ");
                int num1 = scanner.nextInt();
                System.out.print("Número 2: ");
                int num2 = scanner.nextInt();

                int result = 0;
                Math math = new Math();
                switch (choose) {
                    case 1:
                        result = math.add(num1, num2);
                        break;
                    case 2:
                        result = math.subtract(num1, num2);
                        break;
                    case 3:
                        result = math.multiply(num1, num2);
                        break;
                    case 4:
                        result = (math.divide(new BigDecimal(num1),
                                new BigDecimal(num2))).intValue();
                }

                System.out.printf("\nResultado: %d", result);
            }
        } while (choose != 9);
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nOpção: ");
            int choose = scanner.nextInt();

            if ((choose >= 1 && choose <= 4) || choose == 9) {
                return choose;
            } else {
                System.out.printf("Opção %d inválida! Digite 1,2,3,4 ou 9\n",
                        choose);
            }
        }
    }

    private static void menu() {
        System.out.println("\n\nMenu:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("9. Sair");
    }
}
