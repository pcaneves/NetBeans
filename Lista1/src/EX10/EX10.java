package EX10;

import java.util.Scanner;

public class EX10 {

public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int nome;
      double salFixo, vVenda, salFinal;
      double com = 0.15;
      
      System.out.println("Salário final do vendedor");
      System.out.print("Informe o nome do funcionário: ");
      nome = input.nextInt();
      System.out.print("Salário fixo: ");
      salFixo = input.nextFloat();
      System.out.print("Valor vedido no mês: ");
      vVenda = input.nextFloat();
      
      salFinal = salFixo + (vVenda * com);
      
      System.out.println(nome + " receberá " + salFinal );

}

}
