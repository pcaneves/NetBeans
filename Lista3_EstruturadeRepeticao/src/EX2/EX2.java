package EX2;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, soma = 0, i = 1;

        System.out.println("Soma dos números ");
        System.out.print("Informe um nº: ");
        n = input.nextInt();

        while (i <= n) {
            soma = soma + i;
            i++;
        }

        System.out.println("A soma de 1 à " + n + " é igual " + soma);

    }
}
