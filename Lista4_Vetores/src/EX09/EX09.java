package EX09;

import java.util.Scanner;

public class EX09 {

    static Scanner input = new Scanner(System.in);

    static int tamanho() {
        int tamanho;
        System.out.print("Digite o tamanho dos vetores:");
        tamanho = input.nextInt();
        return tamanho;
    }

    static int[] populaVetor(int tam) {
        int vetor[] = new int[tam];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }

    static int[] calculo(int[] vA, int vB[], int tam) {
        int[] vC = new int[tam];
        for (int i = 0; i < vC.length; i++) {
            vC[i] = vA[i] * vB[i];
        }
        return vC;
    }

    static void imprimir(int vC[]) {
        for (int i = 0; i < vC.length; i++) {
            System.out.println("A multiplicação do VETOR A pelo VETOR B na posição [" + i + "] é: " + vC[i]);
        }
    }

    public static void main(String[] args) {
        int tam = tamanho();
        System.out.println("Informe os valores para o VETOR A");
        int vA[] = populaVetor(tam);
        System.out.println("Informe os valores para o VETOR B");
        int vB[] = populaVetor(tam);

        int result[] = calculo(vA, vB, tam);
        imprimir(result);
    }

}
