package metodobolha;

import java.util.Random;

public class Bubble {

    static Random rand = new Random();

    public static void Inserir(char[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (char)(rand.nextInt(25) + 97);
        }
    }

    public static void Imprimir(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
    }

    public static void BubbleSort(char[] a) {
        char temp;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    temp = (char) a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }

}
