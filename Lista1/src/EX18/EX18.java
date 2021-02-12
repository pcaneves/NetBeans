package EX18;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
    double a, b, c, x, a2, b2, c2;
    
        System.out.print("Informe o valor de A: ");
        a = input.nextDouble();
        System.out.print("Informe o valor de B: ");
        b = input.nextDouble();
        System.out.print("Informe o valor de C: ");
        c = input.nextDouble();
    
        if (a<b){
            x=a;
            a=b;
            b=x;
         }
        
         if (b<c){
            x= b;
            b=c;
            c=x;
         }
         
         if (a<b){
             x=a;
             a=b;
             b=x;
         }
         
                 
      a2= a*a;
      b2= b*b;
      c2= c*c;
        
        if (a>=(b+c)){
            System.out.println("Não forma triângulo");
        } 
        if (a2 == (b2 +c2)){
        System.out.println("Triângulo retângulo");
        } 
        if (a2> (b2+c2)){
            System.out.println("Triângulo obtusângulo");            
        } 
        if (a2<(b2+c2)) {
            System.out.println("Triângulo acutângulo");
        } 
        if ((a==b) && (b==c)){
            System.out.println("Triângulo equilátero");            
        } 
        if ((a==b) || (a==c) || (b==c)){
            System.out.println("Triângulo isósceles");
        }
    }
}
