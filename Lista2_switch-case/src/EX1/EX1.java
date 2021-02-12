
package EX1;

import java.util.Scanner;

public class EX1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n, div;
        
        System.out.print("Informe um número: ");
        n = input.nextInt();
        
        div = n%3;

        switch (div)
                {
            case 0:
                System.out.println( n + " é divísivel por 3");
                break;
            default:
                System.out.println(n+ " não é divísivel por 3");
                }
    }
    
}
