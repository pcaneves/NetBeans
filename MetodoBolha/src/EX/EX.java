package EX;

public class EX {

    /**
     * Ordenar um array pelo metodo BubbleSort
     *
     * @param frutas String[]
     */
    public static void BubbleSort(String[] frutas) {
        String aux;

        for (int j = 0; j < frutas.length; j++) {
            for (int i = 0; i < frutas.length - 1; i++) {
                if (frutas[i].compareTo(frutas[i + 1]) > 0) {
                    aux = frutas[i];
                    frutas[i] = frutas[i + 1];
                    frutas[i + 1] = aux;
                }
            }
        }

    }

    public static void Imprimir(String[] frutas) {

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta[" + i + "]=" + frutas[i]);
        }
    }

    public static void main(String[] args) {
        String[] frutas = new String[7];

        frutas[0] = "Maçã";
        frutas[1] = "Pera";
        frutas[2] = "Melancia";
        frutas[3] = "banana";
        frutas[4] = "abacate";
        frutas[5] = "Jaca";
        frutas[6] = "morango";

        Imprimir(frutas);
        System.out.println("");
        System.out.println("Ordenação");
        BubbleSort(frutas);
        Imprimir(frutas);

    }

}
