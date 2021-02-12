package EX01;

import java.util.Scanner;
import java.io.IOException;

public class EX01 {

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
        return vetor;
    }

    static int[] copiarVetor(int[] vA, int[] vB) {
            System.out.println("_____________________________________");
        System.out.println("VETOR A              VETOR B");
        for (int i = 0; i < vA.length; i++) {
            System.out.printf("vetorA[%d]: %d  ", i, vA[i]);
            System.out.printf("     vetorB[%d]: %d", i, vB[i]);
            System.out.println("");
            vB[i] = vA[i];
        }
        return vB;
    }
    
    /*static void clearConsole() {

        String ANSI_CLS = "\u001b[2J";
        System.out.println(ANSI_CLS);
    }*/


    static void imprimirCopia(int[] vA, int[] vB) {
       // clearConsole();
        String ANSI_CLS = "\u001b[2J";
        System.out.println(ANSI_CLS);
        
        System.out.println("_____________________________________");
        System.out.println("Valores do vetor B atulizado com os valores do vetor A");
        System.out.println("VETOR A              VETOR B");
        for (int i = 0; i < vA.length; i++) {
            System.out.printf("vetorA[%d]: %d  ", i, vA[i]);
            System.out.printf("     vetorB[%d]: %d", i, vB[i]);
            System.out.println("");
        }
    }

 
    public static void main(String[] args) {
        int t = tamanho();
        int[] va = criarVetor(t);
        int[] vb = criarVetor(t);
        va = popularVetor(va);
        vb = copiarVetor(va, vb);
        //Runtime.getRuntime().exec('^l');
        imprimirCopia(va, vb);

    }

}
