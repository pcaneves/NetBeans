package EX03;

import java.util.Scanner;

public class EX03 {

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

    static int maiorNumero(int vetor[]) {

        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > aux) {
                aux = vetor[i];
            }
        }
        System.out.println("O maior número é " + aux);

        return aux;
    }

    public static void main(String[] args) {
         int tam = tamanho();
       int[] vetorA = criarVetor(tam);
       System.out.println("Informe os valores para o VETOR: ");
       popularVetor(vetorA);
       maiorNumero(vetorA);
        
    }

}
