package EX17;

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      
      int a, b,c, d;
      
        System.out.print("Informe o valor de A: ");
        a = input.nextInt();
        System.out.print("Informe o valor de B: ");
        b = input.nextInt();
        System.out.print("Informe o valor de C: ");
        c = input.nextInt();
        System.out.print("Informe o valor de D: ");
        d = input.nextInt();
        
        int somaCD, somaAB;
        
        somaCD = c+d;
        somaAB = a+b;
        
        if ((b>c) && (d>a) && (somaCD > somaAB) && (c >0) && (d>0) && (a%2==0))
        {
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores não aceitos");
        }
      
    }
    
}
