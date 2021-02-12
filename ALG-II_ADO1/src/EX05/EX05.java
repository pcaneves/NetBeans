package EX05;

import java.util.Random;
import java.util.Scanner;

public class EX05 {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    /**
     * Cria matriz do tamanho do valor informado no pelo usuário
     *
     * @param m int
     */
    public static int[][] Criar() {

        int n;
        System.out.print("Informe um número para criação da matriz: ");
        n = input.nextInt();

        int[][] m = new int[n][n];

        System.out.println(" ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = rand.nextInt(10);
            }
        }

        Imprimir(m);
        System.out.println(" ");

        return m;
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

    public static void Calcular(int[][] m) {

        int soma = 0, media, x = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if ((i == j) || ((i + j) == (m.length - 1))) {
                    soma += m[i][j];
                    x++;
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println("");
        }

        media = soma / x;
        System.out.println(" ");
        System.out.println("A das diagonais (primária e secundária) é: " + media);
    }

    public static void main(String[] args) {
        int m[][] = Criar();
        Calcular(m);

    }
}
