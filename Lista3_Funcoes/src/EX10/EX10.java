package EX10;

import java.util.Scanner;

public class EX10 {

    static Scanner input = new Scanner(System.in);

    static int entrada() {
        int n;
        System.out.println("Número primo");
        System.out.print("Informe um número: ");
        n = input.nextInt();

        return n;
    }

    static int numPrimo(int n) {
        int i = 0;
        int p = 1;

        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                p = 0;
            }
        }

        if (p == 1) {
            System.out.println("Número primo");
        } else {
            System.out.println("O número não é primo");
        }
        return p;
    }

    public static void main(String[] args) {
        int n = entrada();
        numPrimo(n);
    }
}
