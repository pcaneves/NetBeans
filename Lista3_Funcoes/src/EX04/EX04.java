package EX04;

import java.util.Scanner;

public class EX04 {

    static Scanner input = new Scanner(System.in);

    static int fatorial(int n) {
        int fat = 1, i = 2;

        System.out.println("Fatorial");

        if (n > 0) {
            while (i <= n) {
                fat = fat * i;
                i++;
            }
            System.out.println("-------------------------");
            System.out.println(n + "! = " + fat);
        } else {
            System.out.println("Não possível calcular o fatorial de um número negativo!");
        }
        return fat;
    }

    public static void main(String[] args) {
        int n;

        System.out.print("Informe um número: ");
        n = input.nextInt();

        fatorial(n);
    }

}
