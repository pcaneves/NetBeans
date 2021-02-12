package EX3;

import java.util.Scanner;


public class EX3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1, n2, result;
      
        System.out.println("Soma do quadrado de dois números");
        System.out.print("Informe o 1º número: ");
        n1 = input.nextInt();
        System.out.print("Informe o 2º número: ");
        n2 = input.nextInt();
        
        result = ((n1*n1) + (n2*n2));
        
        System.out.println("A soma do quadrado dos números informados " + n1 + " e " + n2 + " é " + result);
        
    }
    
}
