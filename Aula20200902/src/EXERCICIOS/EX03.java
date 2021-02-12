package EXERCICIOS;

import static EXERCICIOS.EX02.Entrada;
import java.util.Random;

public class EX03 {

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
    }

    /**
     * Imprime matriz do triangulo superior a partir da diagonal pricipal
     *
     * @param m int[][]
     */
    public static void ExibirSuperior(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i <= j) {
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("\n");
        }
        /**
         * Imprime matriz do triangulo inferior a partir da diagonal pricipal
         *
         * @param m int[][]
         */
        //EXECICIO 04
    public static void ExibirInferior(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i >= j) {
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        int[][] m = new int[10][10];
        Entrada(m);
        ExibirSuperior(m);
        ExibirInferior(m);
    }

}
