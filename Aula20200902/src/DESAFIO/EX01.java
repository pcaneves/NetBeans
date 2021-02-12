package DESAFIO;

import java.util.Random;
import java.util.Scanner;

public class EX01 {

    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    /**
     * Entrada de cada elemento para a matriz
     *
     * @param m float [][]
     */
    public static void Entrada(int[] m) {

        for (int i = 0; i < m.length; i++) {

            m[i] = rand.nextInt(10); //Gerar de 0 a 20
        }

        Imprecao(m);
    }

    /**
     * Imprime matriz de acordo com os valores do momento
     *
     * @param m int[][]
     */
    public static void Imprecao(int[] m) {

        for (int i = 0; i < m.length; i++) {

            System.out.print(m[i] + " ");

            System.out.print("\n");
        }
    }

    public static void Uniao(int[] mA, int[] mB, int[] mC) {
        int i = 0, j = 0, k = 0;

        while ((i < mA.length) && (j < mB.length)) {
            if (mA[i] < mB[j]) {
                mC[k] = mA[i];
                i++;
                k++;
            } else {
                mC[k] = mA[i];
                j++;
                k++;
            }
        }

        while (i < mA.length) {
            mC[k] = mA[i];
            i++;
            k++;
        }
        while (i < mB.length) {
            mC[k] = mA[i];
            i++;
            k++;
        }

        System.out.println("");
        Imprecao(mC);
    }

    public static void main(String[] args) {
        int[] mA = new int[4];
        System.out.println("MATRIZ A");
        Entrada(mA);
        int[] mB = new int[4];
        System.out.println("MATRIZ B");
        Entrada(mB);

        int[] mC = new int[mA.length + mB.length];
        Uniao(mA, mB, mC);

    }
}
