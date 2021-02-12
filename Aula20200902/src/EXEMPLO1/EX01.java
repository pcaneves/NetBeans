package EXEMPLO1;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];

        System.out.println("Insira os valos para a matrix [LINHA][COLUNA]");
        for (int i = 0; i < m.length; i++)//Percorre as linhas
        {
            for (int j = 0; j < m[0].length; j++)//Percorre as colunas
            {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = input.nextDouble();
            }
        }

        System.out.println("============MATRIZ============");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
