package EX2;

import java.util.Scanner;


public class EX2 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int diaNum;
      String dia = null;
      
         System.out.println("Dias da semana");
         System.out.print("Informe um número para verificar a referencia do dia da semana: ");
         diaNum = input.nextInt();
         
         switch (diaNum)
         {
             case 1:
                 dia = "Domingo - Fim de semana";
                 break;
                 case 2:
                dia = "Segunda-feira - Dia últil";
                break;
            case 3:
                dia = "Terça-feira - Dia últil";
                break;
            case 4:
                dia = "Quarta-feira - Dia últil";
                break;
            case 5:
                dia = "Quinta-feira - Dia últil";
                break;
            case 6:
                dia = "Sexta-feita - Dia últil";
                break;
            case 7:
                dia = "Sábado - Final de semana";
                break;
            default:
                System.out.println("Dia informado inválido");
                return;
         }
         System.out.println(diaNum + " é referente a " + dia);
     }
}
