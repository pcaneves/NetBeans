package EX5;

import java.util.Scanner;

public class EX5 {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      int mes;
      
      System.out.println("Alta/baixa temporada");
      System.out.print("Informe o mês (1-12): ");
      mes = input.nextInt();
      
      
      switch (mes){
      case 1:
             System.out.println("Janeiro - alta temporada");
             break;
         case 2: 
                 System.out.println("Fevereiro - baixa temporada");
             break;
         case 3:
             System.out.println("Março - baixa temporada");
             break;
         case 4:
             System.out.println("Abril - baixa temporada");
             break;
         case 5:
             System.out.println("Maio - baixa temporada");
             break;
         case 6:
             System.out.println("Junho - alta temporada");
             break;
         case 7:
             System.out.println("Julho  - alta temporada");
             break;
         case 8:
             System.out.println("Agosto - baixa temporada");
             break;
         case 9:
             System.out.println("Setembro - baixa temporada");
             break;
         case 10:
             System.out.println("Outubro - baixa temporada");
             break;
         case 11:
             System.out.println("Novembro - baixa temporada");
             break;
         case 12:
             System.out.println("Dezembro - alta temporada");
             break;
         default:
             System.out.println("Mês informado inválido");
      }
}
}
