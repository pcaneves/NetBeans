package EX15;

import java.util.Scanner;

public class EX15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fat = 1, i = 2, n;

        System.out.println("Calculo de fatoriais");
        System.out.print("Informe um número: ");
        n = input.nextInt();

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
    }

}
