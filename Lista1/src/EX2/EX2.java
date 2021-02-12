package EX2;

import java.util.Scanner;


public class EX2 {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double base, exp, result;
      
        System.out.print("Potenciação");
        System.out.println("Informe o valor da base: ");
        base = input.nextDouble();
        System.out.print("Informe o valor do expoente: ");
        exp = input.nextDouble();
        
        result = Math.pow(base, exp);
        
        System.out.println("O resultado final é: " + result);
        
    }
    
}