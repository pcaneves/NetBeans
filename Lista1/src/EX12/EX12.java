
package EX12;

import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    
    int l, r;
    double areaC, areaQ;
    
        System.out.println("Calculo da área do circulo e do quadrado");
        System.out.print("Informe o valor do raio circulo: ");
        r = input.nextInt();
        System.out.print("Informe o valor lado do quadrado: ");
        l = input.nextInt();
        
        areaC = (3.14 *(r*r));
        areaQ = l*l;
        
        if (areaC > areaQ){
            System.out.println("A maior área é do círculo");            
        }else{
            System.out.println("A maior área é do quadrado");
        }        
      
    }
}
