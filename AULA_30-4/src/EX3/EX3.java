
package EX3;

import java.util.Scanner;

public class EX3 {
    
    static Scanner input = new Scanner(System.in);
    static String result;
    
    static String parImpar(int n){
       
        if (n%2==0){
            result = "PAR";
        }else {
         result = "ÍMPAR";
        }    
        return result;
        
    }
    
    
     public static void main(String[] args) {
      
         int n;         
         System.out.print("Informe um número: ");
         n = input.nextInt();
        
         parImpar (n);
         System.out.println(n + " é " + result);
     }
}
