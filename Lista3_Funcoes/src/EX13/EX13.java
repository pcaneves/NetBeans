
package EX13;

import java.util.Scanner;

public class EX13 {
     static Scanner input = new Scanner(System.in);
     
     static double entrada (){
        double media;
        System.out.println("Conceito de aluno");
        System.out.print("Informe a média do aluno: ");
        media = input.nextDouble();
        
        return media;
    }
     
     static String conceito (double media){
     String conceito = null;
     
         if (media >= 0  && media < 5)
             conceito = "D";
         if (media >= 5  && media < 7)
             conceito = "C";
         if (media >= 7  && media < 9)
             conceito = "B";
         if (media >=9 && media < 10)
             conceito = "A";
     
         System.out.println("O conceito do aluno é: " + conceito);
         
     return conceito;
     }
     
         public static void main(String[] args) {
         double media = entrada();
         conceito (media);         
         }
    
}
