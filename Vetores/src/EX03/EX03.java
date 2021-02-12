package EX03;

import java.util.Scanner;

public class EX03 {
          static Scanner input
                  = new Scanner(System.in);
    
    static int tamanho(){
        int t;
        System.out.print("Digite o tamanho do vetor: ");
        t = input.nextInt();
        return t;
    }
    
    static int[] criarVetor(int t){
        int[] vetor = new int[t];
        return vetor;
    }
    
    static int[] popularVetor(int[] vetor){
        System.out.println("_____________________________________");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("vetor[%d]: ", i );
            vetor[i] = input.nextInt();
        }
        return vetor;
    }
    
    static int[] dobrodoVetor(int[] vA, int[] vB, int[] vC){
        int i = 0;
        System.out.println("_____________________________________");
        System.out.println("VETOR A             VETOR B");
        while(i < vA.length){
            vC[i] = vA[i];
            System.out.printf("vetorA[%d] : %d\n", i, vA[i]);
            i++;
        }

        for(int x = 0; x < vB.length; x++){
            vC[i] = vB[x];
            System.out.printf("                vetorB[%d] : %d\n", x, vB[x]);
            i++;
        }
        return vC;
    }
    
    static void imprimirUniao(int[] vC){
        System.out.println("_____________________________________");
        System.out.println("VETOR C");
         for(int i = 0; i < vC.length; i++){
            System.out.printf("vetorC[%d]: %d\n", i, vC[i]);
        }        
    }
    
    public static void main(String[] args) {
        int t = tamanho();
        int[] vA = criarVetor(t);
        int[] vB = criarVetor(t); 
        int[] vC = criarVetor(t*2);
        System.out.println("Insira os valores para o vetor A ");
        vA = popularVetor(vA);
        System.out.println("Insira os valores para o vetor B ");
        vB = popularVetor(vB);
        vC = dobrodoVetor(vA, vB, vC);
        imprimirUniao(vC);
    }    
}
