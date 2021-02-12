package EX7;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double nA, nB, hipotenusa;
        
        System.out.println("Calcule a base da hipotenusa ");
        System.out.print("Informe o 1º lado do triângulo: ");
        nA = input.nextDouble();
        System.out.print("Informe o 2º lado do triângulo: ");
        nB = input.nextDouble();
        
        hipotenusa = Math.sqrt((nA*nA)+(nB*nB));
        
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
    
}
