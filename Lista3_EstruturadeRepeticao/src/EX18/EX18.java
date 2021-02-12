package EX18;

import java.util.Scanner;

public class EX18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, n1 = 1, n2 = 1, n3 = 0;

        System.out.print("Informe um número: ");
        n = input.nextInt();

        if (n <= 46) {
            while (n > 0) {

                n2 = n3;
                n3 = n3 + n1;
                n1 = n2;
                n--;
                System.out.println(n3);
            }
        } else {
            System.out.println("O número deve ser menos que 46");

        }
    }
}
