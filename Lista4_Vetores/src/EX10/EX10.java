package EX10;

import java.util.Scanner;

public class EX10 {
   
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
    
    
    public static void main(String[] args) {
        int tam = tamanho();
        int [] vA = criarVetor(tam);
        int [] vB = criarVetor(tam);
        
    }
    
    
    static float [] vetor (){
        Scanner entrada = new Scanner(System.in);
        
        int tamanho;
        float resultado = 1, n;
        
        System.out.println("Digite o tamanho do vetor:");
        tamanho = entrada.nextInt();
        System.out.println("Digite um número para multiplicar:");
        n = entrada.nextInt();
        
        int vetor [] = new int [tamanho];
        float vetor2 [] = new float [tamanho];
        
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor do vetor:");
            vetor [i] = entrada.nextInt();
        
            if(i % 2 != 0)
            resultado = vetor [i] * n;
            vetor2 [i] = resultado;
        }
        
        return vetor2;
    }
    
    static void imprimir(float [] vetor2){
       for(int i = 0; i < vetor2.length; i++){
            if(i % 2 != 0)
            System.out.println("O resultado da multiplicação da posição "+i+ " é: ["+vetor2 [i]+"]");
        }
}
