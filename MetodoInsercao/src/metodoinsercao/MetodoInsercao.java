
package metodoinsercao;

/**
 *
 * @author pammy
 */
public class MetodoInsercao {

 /**
     * Ordena um conjunto de dados pelo método da inserção.
     *
     * @param v int[]
     */
    public static void insertionSort(int[] v) {
        /* No início do processo considera-se um 
         elemento na posição correta. Na sequência
         compara-se com o elemento à direita. 
         Se o primeiro elemento for maior que 
         o segundo elemento (temp), troque-os de posição.
         Nessa lógica, quando houver mais elementos à 
         esquerda deverá ser verificada a quantidade de elemento 
         e se esses elementos à esquerda são maiores que o temp.
         Desta forma os elemento são deslocados à direita.
        */
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
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "]=" + v[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
