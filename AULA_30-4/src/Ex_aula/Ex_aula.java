package Ex_aula;

import java.util.Scanner;

public class Ex_aula {

    static int minimo(int a, int b) {
        int min = 0;        

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       int x, y;
       
        System.out.print("Informe o 1º número: ");
        x = input.nextInt();
        System.out.print("Informe o 2º número: ");
        y = input.nextInt();
        
        int result = minimo(x, y);
        System.out.println("O minimo entre " + x + " e " + y + " é "+ result);
    }

}
