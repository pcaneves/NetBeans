
package EX11;

import java.util.Scanner;


public class EX11 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i, n;
        double soma = 0;
        
         System.out.print("Informe um núemro para calcular a soma das divisões: ");
         n= input.nextInt();

        for (i = 1; i <= n; i++) {
            soma = soma - (1 / (double) i);
        }
        System.out.println("Soma: " + soma);
     }
}
