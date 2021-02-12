package EX01;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t;
        System.out.print("Digite o tamanho do vetor: ");
        t = input.nextInt();

        int[] vetor = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }

            System.out.println("_____________________________________________");        
            System.out.println("VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetorA[%d]: %d \n ", i, vetor[i]);
        }

    }

}
