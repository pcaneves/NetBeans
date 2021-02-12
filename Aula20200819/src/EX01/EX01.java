package EX01;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v[] = new int[20];
        int menor = v[0];
        int maior = v[0];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite um valor para posição [" + i + "]: ");
            v[i] = input.nextInt();
            if (v[i] < menor) {
                menor = v[i];
            }
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        System.out.println("---------------------");
        for (int i = 0; i < 20; i++) {
            System.out.print("v[" + i + "]: " + v[i]);
            if (v[i] == menor) {
                System.out.print(" <-- menor");
            }
            if (v[i] == maior) {
                System.out.print(" <-- maior");
            }
            System.out.println("");
        }
    }

}
