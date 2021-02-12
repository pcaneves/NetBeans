package EX05;

import java.util.Scanner;

public class EX05 {

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

    static double mediaVetores(int[] vetor) {
        double media = 0, soma = 0;
        

        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];            
        }
        media = soma / vetor.length;
        System.out.println("A média dos valores informados é: " + media);
        return media;
    }

    public static void main(String[] args) {
        int tam = tamanho();
        int[] vetorA = criarVetor(tam);
        System.out.println("Informe os valores para o VETOR: ");
        popularVetor(vetorA);

        mediaVetores(vetorA);
    }
}
