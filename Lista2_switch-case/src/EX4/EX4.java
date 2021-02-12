
package EX4;

import java.util.Scanner;

public class EX4 {
 public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      int mes, ano;

     System.out.println("Dias do mês");
     System.out.print("Informe o mês (1-12): ");
     mes = input.nextInt();
     System.out.print("Informe o ano: ");
     ano = input.nextInt();
     
     
     
     switch (mes) {
         case 1:
             System.out.println("O mês de janeiro tem 31 dias");
             break;
         case 2: 
             if(ano % 400 == 0){
                } else if((ano % 4 == 0) && (ano % 100 != 0)){
                 System.out.println("O mês de fevereiro tem 29 dias");
                } else{
                 System.out.println("O mês de fevereiro tem 28 dias");
                }
             break;
         case 3:
             System.out.println("O mês de março tem 31 dias");
             break;
         case 4:
             System.out.println("O mês de abril tem 30 dias");
             break;
         case 5:
             System.out.println("O mês de maio tem 31 dias");
             break;
         case 6:
             System.out.println("O mês de junho tem 30 dias");
             break;
         case 7:
             System.out.println("O mês de julho tem 31 dias");
             break;
         case 8:
             System.out.println("O mês de agosto tem 31 dias");
             break;
         case 9:
             System.out.println("O mês de setembro tem 30 dias");
             break;
         case 10:
             System.out.println("O mês de outubro tem 31 dias");
             break;
         case 11:
             System.out.println("O mês de novembro tem 30 dias");
             break;
         case 12:
             System.out.println("O mês de dezembro tem 31 dias");
             break;
         default:
             System.out.println("Mês informado inválido");
     }
 
 }
}
