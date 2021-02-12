package EX15;

import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
      int a, b, c;
      double delta, x1, x2;
      
        System.out.println("Equação de segundo grau (Bhaskara)");
        System.out.print("Informe o 1º número: ");
        a = input.nextInt();
        System.out.print("Informe o 2º número: ");
        b = input.nextInt();
        System.out.print("Informe o 3º número: ");
        c = input.nextInt();
      
        delta = (Math.pow(b, 2) -4 * (a*c));
        
        if (delta <= 0) {            
            System.out.println("Impossível calcular");
        } else {
        
        int dividendo = 2*a;
        x1 = ((-b + Math.sqrt(delta))/dividendo);
        x2 = ((-b - Math.sqrt(delta))/dividendo);
            System.out.println("Resultados");
            System.out.println("X' " +x1);
            System.out.println("X'' "+x2);
        
        }
        
        
      
    }
}
