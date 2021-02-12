package EX01;

import java.util.Scanner;

public class EX01 {

    static Scanner input = new Scanner(System.in);
    static int x = 0;

    static int menorNumero(int a, int b, int c) {

        if ((a < b) && (a < c)) {
            x = a;
        } else if ((b < c) && (b < a)) {
            x = b;
        } else if ((c < a) && (c < b)) {
            x = c;
        }
        return x;
    }

    public static void main(String[] args) {

        int a, b, c;

        System.out.print("Informe o valor de A: ");
        a = input.nextInt();
        System.out.print("Informe o valor de B: ");
        b = input.nextInt();
        System.out.print("Informe o valor de C: ");
        c = input.nextInt();

        menorNumero(a, b, c);
        System.out.println("O menor valor é: " + x);
    }
// 96, 154, 7456
}
