package EX06;

import java.util.Scanner;

public class EX06 {

    static Scanner input = new Scanner(System.in);

    static int tamanho() {
        int t;
        System.out.print("Digite o tamanho do vetor: ");
        t = input.nextInt();
        return t;
    }

    static int[] criarVetor(int t) {
        int[] vetor = new int[t];
        return vetor;
    }

    static int[] popularVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elementos do vetor");
        System.out.println(vetor[i]);
        }
        
        return vetor;
    }

    public static void main(String[] args) {
        int tam = tamanho();
        int[] vetor = criarVetor(tam);
        popularVetor(vetor);
        
    }

}
