package EX01;

public class EX01 {

    public static void Imprimir(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "          ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int m[][] = new int[15][2];
        int n = 1, x = 1;

        System.out.println("Termo(º)" + "  Valor");
        for (int i = 0; i < m.length; i++) {
            m[i][0] = x;
            for (int j = 1; j < m[0].length; j++) {
                m[i][1] = ((n*n) + n )/ 2;
                n++;
            }
            x++;
        }
        Imprimir(m);
    }

}
