
package EX10;

import java.util.Scanner;


public class EX10 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
     
     int n1, n2;
     float result;
     String operacao;
     
         System.out.println("Operações matemática");
         System.out.print("Informe a operação que deseja realizar ( +, -, * ou /): ");
         operacao = input.next();
         
         switch (operacao){
             case "+":
             case "soma":
                 System.out.print("Informe o 1º número a somar: ");
                 n1 = input.nextInt();
                 System.out.print("Informe o 2º número a somar: ");
                 n2 = input.nextInt();
                 result = n1 + n2;
                 System.out.println(n1+" + " +n2+" = "+ result);
                 break;
             case "-":
             case "subrtração":
                 System.out.print("Informe o minuendo: ");
                 n1 = input.nextInt();
                 System.out.print("Informe o subtraendo: " );
                 n2 = input.nextInt();
                 result = n1 - n2;
                 System.out.println(n1+" - " +n2+" = "+ result);
                 break;
             case "*":
             case "multiplicação":    
                 System.out.print("Informe o nº a ser multiplicado: ");
                 n1 = input.nextInt();
                 System.out.print("Informe o multiplicador: " );
                 n2 = input.nextInt();
                 result = n1 * n2;
                 System.out.println(n1+" * " +n2+" = "+ result);
                 break;
             case "/":
             case "divisão":
                 System.out.print("Informe o dividendo:  ");
                 n1 = input.nextInt();
                 System.out.print("Informe o divisor: " );
                 n2 = input.nextInt();
                 result = n1 / n2;
                 System.out.println(n1+" / " +n2+" = "+ result);
                 break;
             default:
                 System.out.println("Operação informada inválida para esse programa");        
         
         }
     }
}
