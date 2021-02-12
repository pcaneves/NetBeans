package MatrixBidimensional;

public class MatrixBidimensional {

    public static void main(String[] args) {
        int[][] m = {
            {1, 4},
            {2, 2},
            {5, 6}
        };
        int soma = 0;
        for (int i = 0; i < m.length; i++)//Percorre as linhas
        {
            for (int j = 0; j < m[0].length; j++)//Percorre as colunas
            {
                soma += m[i][j];
            }
        }
        System.out.println("Soma=" + soma);
    }

}


