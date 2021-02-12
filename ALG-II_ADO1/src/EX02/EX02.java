package EX02;

import java.util.Random;
import java.util.Scanner;

public class EX02 {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    /**
     * Cria a matriz de acordo com o número de linhas e colunas informados pelo
     * usuário
     */
    public static int[][] Criar() {
        int l, c;

        System.out.print("Informe a quantidade de linhas da matriz: ");
        l = input.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        c = input.nextInt();

        int m[][] = new int[l][c];

        return m;
    }

    /**
     * Popula a matriz com número aleatórios
     *
     * @param m int [][]
     */
    public static void Popular(int m[][]) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rand.nextInt(10);
            }
        }
        Imprimir(m);
    }

    /**
     * Imprime matriz de acordo com os valores do momento
     *
     * @param m int[][]
     */
    public static void Imprimir(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     * Calcula e exibe a média ártimetica da matriz
     * Em seguida exibe os valores da matriz superiores a média 
     * @param m int [][]
     */
    public static void Calcular(int[][] m) {
        int soma = 0, count = 0;
        float media;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
                count++;
            }
        }

        media = soma / count;
        System.out.println("A média dos elementos da matiz é " + media);

        System.out.println("");
        System.out.println("Os elementos abaixo, tem o valor superior a média:");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] > media) {
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print("-" + " ");
                }
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        int m[][] = Criar();
        Popular(m);
        Calcular(m);

    }

}
