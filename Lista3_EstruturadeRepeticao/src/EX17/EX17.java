package EX17;

import java.util.Scanner;

public class EX17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;

        System.out.print("Informe um número: ");
        n = input.nextInt();

        System.out.println("Os devisores de " + n + " são: ");
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
