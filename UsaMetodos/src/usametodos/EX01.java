package usametodos;

import java.util.Random;
import java.util.Scanner;

public class EX01 {

    static Random rand = new Random();
    static Scanner input = new Scanner(System.in);

    public static int[] CriarVetor() {
        int t;
        System.out.print("Informe o tamanho do vetor: ");
        t = input.nextInt();

        int v[] = new int[t];
        for (int i = 0; i < v.length; i++) {
            v[i] = rand.nextInt(100);
        }
        return v;

    }

    public static void main(String[] args) {

        int v[] = CriarVetor();
        Metodo.Exibir(v);
        System.out.println("");
        System.out.println("-- VETOR ORDENADO --");
        long ti = System.currentTimeMillis();//Marca o tempo inicial
        Metodo.SelectionSort(v);
        long tf = System.currentTimeMillis();//Marca o tempo final
        long intervalo=tf-ti;//Determina o intervalo
        
        Metodo.Exibir(v);
        
        System.out.println("");        
        System.out.println("Tempo="+intervalo);

    }

}
