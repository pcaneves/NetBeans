package EX13;

import java.util.Scanner;

public class EX13 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
     int n1, n2, n3;
     
         System.out.println("Descubra qual é o maior número: ");
         System.out.print("Informe o 1º número: ");
         n1 = input.nextInt();
         System.out.print("Informe o 2º número: ");
         n2 = input.nextInt();
         System.out.print("Informe o 3º número: ");
         n3 = input.nextInt();
     
         if ((n1 > n2) && (n1 > n3)){         
         System.out.println("O maior número é: " + n1);
     }
         if ((n2 > n1) && (n2 > n3)){         
         System.out.println("O maior número é: " + n2);
     }
         if ((n3 > n1) && (n3 > n2)){         
         System.out.println("O maior número é: " + n3);
     }
     
     }
}
