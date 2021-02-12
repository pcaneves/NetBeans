package EX2;

import java.util.Scanner;

public class EX2 {

    static Scanner input = new Scanner(System.in);
    static int maior;

    static int maiorN(int n1, int n2) {
        
        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }
        return maior;
    }

    public static void main(String[] args) {        
        int n1, n2;
        
        System.out.print("Informe o 1º número ");
        n1 = input.nextInt();
        System.out.print("Informe o 2º número ");
        n2 = input.nextInt();

        maiorN(n1, n2);
        System.out.println("O maior número é " + maior);

    }

}
