package EX4;

import java.util.Scanner;


public class EX4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1, n2,nextN1, nextN2;
      
        System.out.println("Sequencia de dois números");
        System.out.print("Informe o 1º número: ");
        n1 = input.nextInt();
        System.out.print("Informe o 2º número: ");
        n2 = input.nextInt();
        
        nextN1= n1 + 1;
        nextN2= n2 + 1;
        System.out.println("O número consecutivo de " + n1 + " é " + nextN1);
        System.out.println("O número consecutivo de " + n2 + " é " + nextN2);
        
    }
    
}
