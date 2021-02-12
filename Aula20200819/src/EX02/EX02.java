package EX02;

import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vA[] = new float[5];
        float vB[] = new float[5];
        float vC[] = new float[5];

        System.out.println("Informe os valores para o VETOR A");
        for (int i = 0; i < vA.length; i++) {
            System.out.print("Digite um valor para posição [" + i + "]: ");
            vA[i] = input.nextFloat();
        }
        
        System.out.println("______________________________________________");
        System.out.println("Informe os valores para o VETOR B");
        for (int i = 0; i < vB.length; i++) {
            System.out.print("Digite um valor para posição [" + i + "]: ");
            vB[i] = input.nextFloat();
        }
        
        System.out.println("VETOR = Soma dos vetores A e B de mesmo indice");
         for (int i = 0; i < vC.length; i++) {
             vC[i] = vA[i] + vB[i];
             System.out.println("vC[" + i + "] --> " + vA[i] + " + " + vB[i] + " = " + vC[i]) ;
         }
    }

}
