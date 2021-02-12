package EX9;

import java.util.Scanner;

public class EX9 {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int id;
      double horaT, valorHora, sal;
      
      System.out.println("Calcule o salário ");
      System.out.print("Informe o ID do funcionário: ");
      id = input.nextInt();
      
      System.out.print("Informe o quantidades de horas trabalhadas: ");
      horaT = input.nextDouble();
      System.out.print("Informe o valor da hora trabalhada: ");
      valorHora = input.nextDouble();
      
      sal = horaT*valorHora;
      
      System.out.println("O salário do funcionário de ID " + id + " será " + sal);
      

}
}
