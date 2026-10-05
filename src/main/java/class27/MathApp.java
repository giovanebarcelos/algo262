package class27;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        math();
    }

    private static void math() {
        menu();
        int choose = getOption();
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
        System.out.println("Menu:");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("9. Sair");
    }
}
