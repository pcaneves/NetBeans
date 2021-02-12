package EXERCICIOS;

import java.util.Random;

public class EX06 {

    static Random rand = new Random();

    /**
     * Entrada de cada elemento para a matriz
     *
     * @param m float [][]
     */
    public static void Entrada(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rand.nextInt(10); //Gerar de 0 a 20
            }
        }

        Imprecao(m);
    }

    /**
     * Imprime matriz de acordo com os valores do momento
     *
     * @param m int[][]
     */
    public static void Imprecao(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void Soma(int[][] mA, int[][] mB) {

        int[][] mC = new int[mA.length][mA[0].length];

        for (int i = 0; i < mC.length; i++) {
            for (int j = 0; j < mC[0].length; j++) {
                mC[i][j] = mA[i][j] + mB[i][j];
            }
        }
        Imprecao(mC);
    }

    public static void main(String[] args) {
        int[][] mA = new int[4][4];
        System.out.println("MATRIZ A");
        Entrada(mA);
        int[][] mB = new int[4][4];
        System.out.println("MATRIZ B");
        Entrada(mB);
        
        System.out.println("SOMA DAS MATRIZES");
        Soma(mA, mB);

    }
}
