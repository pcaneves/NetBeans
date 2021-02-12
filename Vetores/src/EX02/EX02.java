package EX02;

import java.util.Scanner;

public class EX02 {

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
        System.out.println("_____________________________________");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    static int[] somaVetores(int[] vA, int[] vB, int[] vC) {
        for (int i = 0; i < vC.length; i++) {
            vC[i] = vA[i] + vB[i];
        }
        return vC;
    }

    static void imprimirSoma(int[] vA, int[] vB, int[] vC) {
        System.out.println("_____________________________________");
        System.out.println("Soma dos vetores (VETOR A + VETOR B = VETOR C)");
        System.out.println("VETOR A              VETOR B               VETOR C");
        for (int i = 0; i < vA.length; i++) {
            System.out.printf("vetorA[%d]: %d  ", i, vA[i]);
            System.out.printf("     vetorB[%d]: %d", i, vB[i]);
            System.out.printf("          vetorC[%d]: %d", i, vC[i]);
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        int t = tamanho ();
        int[] vA = criarVetor(t);
        int[] vB = criarVetor(t);
        int[] vC = criarVetor(t);
        System.out.println("Insira os valores do vator A");
        vA = popularVetor(vA);
        System.out.println("Insira os valores do vator B");
        vB = popularVetor(vB);
        somaVetores(vA, vB, vC);
        imprimirSoma (vA, vB,vC);
        
    }
}


