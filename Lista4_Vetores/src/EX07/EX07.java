package EX07;

import java.util.Scanner;

public class EX07 {

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

    static double multiplicacaoVetor(int[] vetor) {
        double mult = 1;
        System.out.println("Informe os valores dos elementos: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            mult = mult * vetor[i];
        }
        System.out.println("A múltiplicação dos valores informados é: " + mult);

        return mult;
    }

    public static void main(String[] args){
        int tam = tamanho();
        int[] vetor = criarVetor(tam);
        multiplicacaoVetor(vetor);

    }

}
