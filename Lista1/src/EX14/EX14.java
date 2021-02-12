package EX14;

import java.util.Scanner;

public class EX14 {
public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      float n1, n2, result;
      
      System.out.println("Divisão do maior pelo menor número informado ");
      System.out.print("Informe o 1º número: ");
      n1 = input.nextFloat();
      System.out.print("Informe o 2º número: ");
      n2 = input.nextFloat();
      
      
      
      if (n1 > n2)
      {
          result = n1/n2;
          System.out.println(n1 + "/" + n2 + "=" + result);
      } else {
          result = n2/n1;
          System.out.println(n2 + "/" + n1 + "=" + result);
      }
      
      
}
}
