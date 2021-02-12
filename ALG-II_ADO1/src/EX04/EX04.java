package EX04;

import java.util.Random;
import java.util.Scanner;

public class EX04 {

    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();

    /**
     * Cria a matriz de acordo com o número de linhas e colunas informados pelo
     * usuário
     */
    public static float[][] Criar() {
        int l, c;

        System.out.print("Informe a quantidade de linhas da matriz: ");
        l = input.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz: ");
        c = input.nextInt();

        float m[][] = new float[l][c];

        return m;
    }

    /**
     * Popula a matriz com número aleatórios
     *
     * @param m int [][]
     */
    public static void Popular(float m[][]) {

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
    public static void Imprimir(float[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    /**
     * Soma e exibe cada elemento das linhas
     * @param m [][]
     */
    public static void SomarLinhas(float m[][]) {
        float soma = 0;

        for (int i = 0; i < m.length; i++) {
            soma = 0;
            for (int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
                System.out.print(m[i][j] + "  ");
            } 
            System.out.print(" = " + soma);
            System.out.println("");
        }   
    }

    public static void main(String[] args) {
        float m[][] = Criar();
        Popular(m);
        System.out.println("");
        System.out.println("Soma de cada linha da matriz");
        SomarLinhas(m);
    }

}
