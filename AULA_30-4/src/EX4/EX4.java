package EX4;

import java.util.Scanner;

public class EX4 {

    static Scanner input = new Scanner(System.in);
    static double xResult = 0.0;

    static double resultX(double x) {
        

        if (x < -1) {
            xResult = x + 2;
        } else if ((-1 <= x) && (x <= 2)) {
            xResult = (Math.pow(x, 2) - 4);
        } else if (x > 2) {
            xResult = ((2 * x) - 1);
        }
        return xResult;
    }

    public static void main(String[] args) {
        double x, func;
        
        System.out.print("Informe o valor de x: ");
        x = input.nextDouble();

       resultX(x);
        System.out.println();

    }
}

