package EX3;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, aux = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + " número:");
            n1 = input.nextInt();
            if (n1 > aux) {
                aux = n1;
            }
        }
        System.out.println("O maior número é " + aux);
    }
}
