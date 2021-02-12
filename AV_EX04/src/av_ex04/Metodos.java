package av_ex04;

import java.util.Scanner;

public class Metodos {

    static Scanner input = new Scanner(System.in);

    /**
     * Popula a matriz com os valores inseridos pelo usuário
     * @param m int []
     */
    public static void Popular(int m[][]) {
        System.out.println("\nInsira os valores: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = input.nextInt();
            }
        }
    }

    /**
     * Exibe a matriz completa
     * @param m int []
     */
    public static void Exibir(int m[][]) {
        System.out.println("\n=== Matriz ===");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    /**
     * Calcula e exibe a média aritmética da matriz. Em seguida exibe cada elemento da matriz menor ou igual a média
     * @param m int []
     */
    public static void Calcular(int m[][]) {
        int soma = 0, count = 0;
        double media;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                soma += m[i][j];
                count += 1;
            }
        }

        media = soma / count;
        System.out.println("\nA média é dos elementos da matriz é: " + media);

        System.out.print("\nOs elementos menores ou igual a média são: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] <= media) 
                    System.out.print(m[i][j] + " ");
            }
        }
    }
}
