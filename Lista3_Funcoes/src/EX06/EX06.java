package EX06;

import java.util.Scanner;

public class EX06 {

    static Scanner input = new Scanner(System.in);

    static int entradaA() {
        int n;
        System.out.println("BHASKARA");
        System.out.print("Informe o valor de A: ");
        n = input.nextInt();

        return n;
    }

    static int entradaB() {
        int n;
        System.out.print("Informe o valor de B: ");
        n = input.nextInt();

        return n;
    }

    static int entradaC() {
        int n;
        System.out.print("Informe o valor de C: ");
        n = input.nextInt();

        return n;
    }

    static double equacao(int a, int b, int c) {

        double delta, x1, x2, maiorRaiz;

        delta = (Math.pow(b, 2) - 4 * (a * c));

        if (delta <= 0) {
            maiorRaiz = -1;
            System.out.println("As raízes não serão reais");
            System.out.println("Raiz: " + maiorRaiz);
        } else {

            int dividendo = 2 * a;
            x1 = ((-b + Math.sqrt(delta)) / dividendo);
            x2 = ((-b - Math.sqrt(delta)) / dividendo);

            if (x1 > x2) {
                maiorRaiz = x1;
            } else {

                maiorRaiz = x2;
            }
            
            System.out.println("O valor da maior raiz é: " + maiorRaiz);
        }
        return maiorRaiz;
    }

    public static void main(String[] args) {

        int a = entradaA();
        int b = entradaB();
        int c = entradaC();

        equacao(a, b, c);

    }
}
