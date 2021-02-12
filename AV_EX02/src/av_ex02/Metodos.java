package av_ex02;

import java.util.Random;

public class Metodos {

    static Random rand = new Random();

    /**
     * Popula array istanciado, com valores aleatóirios de 1 à número de tamanho
     * vetor
     *
     * @param v int []
     */
    public static void Popular(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(v.length) + 1;
        }
    }

    /**
     * Exibe apenas os números multiplos de 3 contidos no array
     * @param v int[]
     */
    public static void Exibir(int[] v) {
        System.out.println("");
        System.out.println("Os múltiplos de 3 conidos no array são: ");
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 3 == 0) {
                System.out.println("v[" + i + "]=" + v[i]);
            }
        }
    }
}
