
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
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
     static int somaVetores(int[] vetor) {
         int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
         System.out.println("A soma dos valores informados é: " + soma);
        return soma;
    }


    
        public static void main(String[] args) {
       int tam = tamanho();
       int[] vetorA = criarVetor(tam);
       System.out.println("Informe os valores para o VETOR: ");
       popularVetor(vetorA);
      
       somaVetores(vetorA);
       
       
    }
}
