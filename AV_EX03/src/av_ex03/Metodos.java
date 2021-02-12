package av_ex03;

public class Metodos {

    /**
     * Verifica a quantidade de vezes que cada base Nitrogenada aparece no array
     *
     * @param v char []
     */
    public static void Contabilizar(char[] v) {
        int a = 0, t = 0, g = 0, c = 0;

        for (int j = 0; j < v.length - 1; j++) {
            switch (v[j]) {
                case 'A':
                    a += 1;
                case 'C':
                    c += 1;
                case 'G':
                    g += 1;
                case 'T':
                    t += 1;
                    defaut:
                    break;
            }

        }
        System.out.println("Quatidade de cada base Nitrogenada contida no array:");
        System.out.println("A - " + a + " vezes");
        System.out.println("C - " + c + " vezes");
        System.out.println("G - " + g + " vezes");
        System.out.println("T - " + t + " vezes");
    }
}
