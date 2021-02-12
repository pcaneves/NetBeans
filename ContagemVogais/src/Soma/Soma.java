package Soma;

import java.util.Scanner;

public class Soma {

    static Scanner input = new Scanner(System.in);

    public static float entrada() {
        float n;
        n = input.nextFloat();
        return n;
    }

    public static float soma(float n1, float n2) {
        float soma;

        soma = n1 + n2;

        System.out.println("");
        System.out.println(n1 + " + " + n2 + " = " + soma);
        return soma;
    }

    public static void main(String[] args) {

        System.out.print("Informe o 1º número: ");
        float n1 = entrada();
        System.out.print("Informe o 2º número: ");
        float n2 = entrada();

        soma(n1, n2);

    }
}
