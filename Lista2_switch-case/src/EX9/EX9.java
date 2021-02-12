package EX9;

import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11;
        int calculo1 = 0;
        int calculo2 = 0;

        System.out.println("Informe os número do CPF (um por vez, sem pontuação)");
        System.out.print("Informe o 1º número: ");
        n1 = input.nextInt();
        System.out.print("Informe o 2º número: ");
        n2 = input.nextInt();
        System.out.print("Informe o 3º número: ");
        n3 = input.nextInt();
        System.out.print("Informe o 4º número: ");
        n4 = input.nextInt();
        System.out.print("Informe o 5º número: ");
        n5 = input.nextInt();
        System.out.print("Informe o 6º número: ");
        n6 = input.nextInt();
        System.out.print("Informe o 7º número: ");
        n7 = input.nextInt();
        System.out.print("Informe o 8º número: ");
        n8 = input.nextInt();
        System.out.print("Informe o 9º número: ");
        n9 = input.nextInt();
        System.out.print("Informe o 10º número: ");
        n10 = input.nextInt();
        System.out.print("Informe o 11º número: ");
        n11 = input.nextInt();

        calculo1 = 11 - ((n1 * 10) + (n2 * 9) + (n3 * 8) + (n4 * 7) + (n5 * 6) + (n6 * 5) + (n7 * 4) + (n8 * 3) + (n9 * 2)) % 11;

        if (calculo1 >= 10) {
            calculo1 = 0;
        }

        if (calculo1 != n10) {
            System.out.println("CPF Inválido!");
        } else {
            calculo2 = 11 - ((n1 * 11) + (n2 * 10) + (n3 * 9) + (n4 * 8) + (n5 * 7) + (n6 * 6) + (n7 * 5) + (n8 * 4) + (n9 * 3) + (n10 * 2)) % 11;

            if (calculo2 >= 10) {
                calculo2 = 0;
            }
            if (calculo2 != n11) {
                System.out.println("CPF Inválido!");
            } else {
                System.out.println("CPF Válido!");
            }
        }
    }

}
