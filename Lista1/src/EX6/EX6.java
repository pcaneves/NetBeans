
package EX6;

import java.util.Scanner;

public class EX6 {

public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      float a, b, c, d;
      double triangulo, circulo, trapezio, quadrado, retangulo, perimetro;
      
      System.out.println("Calcule as áreas");
      System.out.print("Informe o valor de A ");
      a = input.nextFloat();
      System.out.print("Informe o valor de B ");
      b = input.nextFloat();
      System.out.print("Informe o valor de C ");
      c = input.nextFloat();
      
      triangulo = (a*c)/2;
      circulo = (3.14159 * (c*c));
      trapezio = ((a+b)*c)/2;
      quadrado = b*b;
      retangulo = a*b;
      perimetro = 2*(a+b);
      
      System.out.println("De acordo com os valores informados: " + a + "," + b + " e " + c);
      System.out.println("A área do triângulo é " + triangulo);
      System.out.println("A área do círculo é " + circulo);
      System.out.println("A área do trapézio é " + trapezio);
      System.out.println("A área do quadrado é " + quadrado);
      System.out.println("A área do retângulo é " + retangulo);
      System.out.println("O perímetro do triângulo é " + perimetro);
      
}
}
