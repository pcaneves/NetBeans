package usametodos;

public class UsaMetodos {

    public static void main(String[] args) {
        int[] vetor = {25, 50, 20, 58, 4, 152, 669};
        Metodo.Exibir(vetor);
        Metodo.SelectionSort(vetor);
        System.out.println("");
        System.out.println("ORDENADO");
        Metodo.Exibir(vetor);
    }

}
