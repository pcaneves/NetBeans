package EXERCICIOS;


import static EXERCICIOS.EX01.rand;
import java.util.Scanner;

public class EX02 {

    static Scanner input = new Scanner(System.in);

    /**
     * Entrada de cada elemento para a matriz
     *
     * @param m float [][]
     */
    public static void Entrada(float[][] m) {
        int max=30, min =10;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                //System.out.print("m[" + i + "]["+ j +"]: ");
                //m[i][j] = input.nextInt();
                m[i][j] = rand.nextFloat()*(max-min)+min;
            }
        }
        System.out.println("============MATRIZ============");
        Imprecao(m);
    }

    /**
     * Imprime matriz de acordo com os valores do momento
     *
     * @param m int[][]
     */
    public static void Imprecao(float[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    
    /**
     * Soma os elementos da diagonal secundária
     * @param m float[][]
     * @return float
     */
    public static float Soma(float[][] m) {
        
        float soma =0;
        System.out.println("");
        System.out.println("==Soma dos elementos da diagonal secundária==");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i + j == 4 - 2) {
                    soma += m[i][j];
                }
            }
        }
        return soma;
    }

    public static void main(String[] args) {

        float[][] m = new float[10][10];
        Entrada(m);
        System.out.println(Soma(m));
        
    }

}
