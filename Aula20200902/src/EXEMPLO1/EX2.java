package EXEMPLO1;

import java.util.Random;
import java.util.Scanner;

public class EX2 {
    static Random rand = new Random();

    static Scanner input = new Scanner(System.in);

    public static void Entrada(double[][] m) {
        System.out.println("Insira os valos para a matrix [LINHA][COLUNA]");
        for (int i = 0; i < m.length; i++)//Percorre as linhas
        {
            for (int j = 0; j < m[0].length; j++)//Percorre as colunas
            {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = rand.nextInt(100); //input.nextDouble();
            }
        }

    }

    public static void Imprimir(double[][] m) {
        System.out.println("============MATRIZ============");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

    public static void DiagPrincipal(double[][] m) {
        System.out.println("============Diagonal Principal============");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j) {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.print("\n");
        }

        // Ou
        // for (int i = 0; i < m.length; i++) {
        //                 System.out.print(m[i][i] + " ");
        // }
    }

    public static void DiagSecundaria(double[][] m) {
        System.out.println("============Diagonal Secundária============");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i + j == 4 - 2) {
                    System.out.println(m[i][j] + "");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        double[][] m = new double[3][2];
        Entrada(m);
        Imprimir(m);
        DiagSecundaria(m);

    }
}
