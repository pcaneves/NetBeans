package EX7;

import java.util.Scanner;

public class EX7 {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      int vlPlano, idade;
      int fixo = 100;
      String tipo = null;
      
      System.out.println("Valor do plano de saúde");
      System.out.print("Informe a idade do paciente: ");
      idade = input.nextInt();
      
      if (idade<10){
          tipo = "Infantil";
      }else if (idade >= 10 && idade <= 30) {
          tipo = "InfantoJuvenil";
          //Como o problema não especifica a idade de 30 a 40 anos, considerei como adulto
      } else if (idade >= 31 && idade < 61 ) {
          tipo = "Adulto";
      } else if (idade > 60){
          tipo = "Idoso";
      }
      
      switch (tipo)
      {
          case "Infantil":
                  vlPlano = 80 + fixo;
                  System.out.println("O valor a ser pago pelo conveniado é R$ " + vlPlano);
                  break;
          case "InfantoJuvenil":
              vlPlano = 50 + fixo;
              System.out.println("O valor a ser pago pelo conveniado é R$ " + vlPlano);
              break;
          case "Adulto":
              vlPlano = 95 + fixo;
              System.out.println("O valor a ser pago pelo conveniado é R$ " + vlPlano);
              break;
          case "Idoso":
              vlPlano = 130 + fixo;
              System.out.println("O valor a ser pago pelo conveniado é R$ " + vlPlano);
              break;
          default:
              break;
      }
}
}
