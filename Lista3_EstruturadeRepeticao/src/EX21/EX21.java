package EX21;

import java.util.Scanner;

public class EX21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i, soma = 0;

        System.out.print("Informe um número: ");
        n = input.nextInt();

        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                soma = soma + i;
            }
        }
        if (soma == n) {
            System.out.println(n + " é um número perfeito!");
        } else {
            System.out.println(n + " não é um número perfeito!");
        }
    }
}
