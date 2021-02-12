package buscasequencial;

public class Metodos {

    // DEsavantagem =  desempenho
    public static int Linear(float[] v, float b) {
        for (int i = 0; i < v.length; i++) {
            if (b == v[i]) {
                return i;
            }
        }
        return -1;
    }
}
