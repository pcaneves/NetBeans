package buscabinaria;

import java.util.Random;

public class Metodos {

    static Random rand = new Random();

    public static void Popular(int v[]) {
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(100);
        }
        Imprimir(v);
    }

    public static void Imprimir(int v[]) {

        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "]: " + v[i]);
        }
    }

    public static void Ordenar(int[] v) {
        int j;//Quantidade de elementos à esquerda
        int temp;
        for (int i = 1; i < v.length; i++) { //Responsável pelas varreduras
            temp = v[i];//Elemento que está à direita
            j = i;
            while (j > 0 && v[j - 1] >= temp) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = temp;
        }
        
        System.out.println("=== ORDENADO ===");
        Imprimir(v);
    }
    
    
    public static int Binaria(int[] v, int b) {
        int inicio = 0, fim = v.length - 1;//São índices
        int central;
        while (inicio <= fim) {
            central = (fim + inicio) / 2;
            if (b == v[central]) {
                return central;
            } else if (b > v[central]) {
                inicio = central + 1;
            } else {
                fim = central - 1;
            }
        }
        return -1;
    }
}
