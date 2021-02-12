
package buscasequencial;

import java.util.Scanner;


public class BuscaSequencial {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        float[] v ={1.2F, 3.4F, 5.6F, 7.8F, 6.5F};
        
        System.out.print("Informe um valor: ");
        float b = input.nextFloat();
        
        Metodos.Linear(v, b);
    }
    
}
