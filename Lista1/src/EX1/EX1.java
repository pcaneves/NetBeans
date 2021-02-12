
package EX1;

import java.util.Scanner;


public class EX1 {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1, n2, result;
      
        System.out.println("Informe o 1º número: ");
        n1 = input.nextInt();
        System.out.println("Informe o 2º número: ");
        n2 = input.nextInt();
      
        result = n1*n2;
        System.out.println(n1 + "x" + n2 + "=" + result);
    }
    
}
