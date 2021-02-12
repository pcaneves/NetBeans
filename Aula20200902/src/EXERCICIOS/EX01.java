package EXERCICIOS;

import java.util.Random;
import java.util.Scanner;

public class EX01 {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    /**
     * Alimenta a matriz com valores aleatórios
     * @param m int [][]
     */
    public static void Entrada(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rand.nextInt(100);
            }
        }
        System.out.println("============MATRIZ============");
        Imprecao(m);
    }

    /**
     * Imprime matriz de acordo com os valores do momento
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

    /**
     * Multiplica cada elemento de uma matriz (de números aleatórios) por um número X inserido pelo usuário
     * @param m int[][] //Matriz
     * @param n int //Número informado pelo usuário
     */
    public static void Multiplicacao(int[][] m, int n) {
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = m[i][j] * n;
            }
        }

        System.out.println("");
        System.out.println("==MATRIZ COM OS ELEMENTOS MULTIPLICADOS==");
        Imprecao(m);
    }

    public static void main(String[] args) {

        int[][] m = new int[5][6];
        Entrada(m);
        
        System.out.print("Informe por qual número deseja multiplicar os elementos da matriz: ");
        int n = input.nextInt();

        Multiplicacao(m, n);

    }
}
