package usametodos;

public class Metodo {

    public static void SelectionSort(int[] v) {
        int menor, i, j, temp;

        for (j = 0; j < v.length - 1; j++) {
            menor = j;
            for (i = 1 + j; i < v.length; i++) {
                if (v[menor] > v[i]) {
                    menor = i;
                }
            }
            temp = v[menor];
            v[menor] = v[j];
            v[j] = temp;
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

    public static void Exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("V[" + i + "] = " + v[i]);
        }
    }

    public static void SelectionSortCar(char[] v) {

        for (int j = 0; j < v.length - 1; j++) {
            int var = j;
            String aux = v[var];
            for (int i = 1 + j; i < v.length; i++) {
                if (v[i].compareTo(aux) < 0) {
                    var = i;
                    aux = v[i];
                }
            }
            v[var] = v[j];
            v[j] = aux;
        }
    }

    public static void BubbleSortCar(String[] c) {
        String aux;

        for (int j = 0; j < c.length; j++) {
            for (int i = 0; i < c.length - 1; i++) {
                if (c[i].compareTo(c[i + 1]) > 0) {
                    aux = c[i];
                    c[i] = c[i + 1];
                    c[i + 1] = aux;
                }
            }
        }

    }

    public static void ImprimirCar(char[] c) {

        for (int i = 0; i < c.length; i++) {
            System.out.println("Posição " + i + " =" + c[i]);
        }
    }
}
