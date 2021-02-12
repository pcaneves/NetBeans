package av_ex04;

import java.util.Scanner;

public class Principal {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int l, c;
        System.out.print("Informe a quantidade de linhas: ");
        l = input.nextInt();
        System.out.print("Informe a quantidade de colunas: ");
        c = input.nextInt();

        int[][] m = new int[l][c];
        Metodos.Popular(m);
        Metodos.Exibir(m);
        Metodos.Calcular(m);

    }

}
