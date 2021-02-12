package BuscaBinariaRecursiva;

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] v = {2, 4, 6, 7, 9, 11, 15, 67};
        System.out.println(Binaria(v, 150, 0, v.length - 1));
    }

    public static int Binaria(int[] v, int b, int inicio, int fim) {
        int central;
        if (fim >= inicio) {
            central = (fim + inicio) / 2;
            if (v[central] == b) {
                return central;
            } else if (b > v[central]) {
                return Binaria(v, b, central + 1, fim);
            } else {
                return Binaria(v, b, inicio, central - 1);
            }
        }
        return -1;
    }

}
