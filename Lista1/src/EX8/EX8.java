
package EX8;

import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
      float n1, n2, n3, n4, media;
      
        System.out.println("Média aritimética");
        System.out.print("Informe o 1º número: ");
        n1 = input.nextFloat();
        System.out.print("Informe o 2º número: ");
        n2 = input.nextFloat();
        System.out.print("Informe o 3º número: ");
        n3 = input.nextFloat();
        System.out.print("Informe o 4º número: ");
        n4 = input.nextFloat();
        
        media = (n1+n2+n3+n4)/4;
        
        System.out.println("A média dos números informados é " + media);
        
}
}
