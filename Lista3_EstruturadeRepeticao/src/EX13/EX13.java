package EX13;

import java.util.Scanner;

public class EX13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;
        double n1 = 1, n2 = 1, soma = 0;

        System.out.print("Informe um núemro: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            n1 = n1 * i;
            n2 = n2 * (2 * i - 1);
            soma = soma + (n1 / n2);            
        }
        System.out.println("Soma = " + soma);
    }
}
