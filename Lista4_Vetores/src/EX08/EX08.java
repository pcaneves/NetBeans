package EX08;

import java.util.Scanner;

public class EX08 {

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

    static int verificacaoVetor(int[] vetor) {
        int n;
        System.out.println("Informe os valores dos elementos: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();           
        }

        System.out.println("___________________________________");
        System.out.print("Infome o número que deseja conferir no vetor: ");
        n = input.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) 
                System.out.println("O número " + n + " está na posição: " + "[" + i + "] do vetor");
        }
        return n;
    }

    public static void main(String[] args) {
        int tam = tamanho();
        int vetor[] = criarVetor(tam);
        verificacaoVetor(vetor);

    }

}
