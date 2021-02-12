package usametodos;

import java.util.Random;

public class EX02 {

    static Random rand = new Random();

    public static void Inserir(char[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (rand.nextInt(25) + 97);
        }
    }

    public static void main(String[] args) {
        char[] v = new char[7];

     /*   v[0] = "Maçã";
        v[1] = "Pera";
        v[2] = "Melancia";
        v[3] = "banana";
        v[4] = "abacate";
        v[5] = "Jaca";
        v[6] = "morango";*/
     
     Inserir(v);
        
        Metodo.ImprimirCar(v);
        Metodo.SelectionSortCar(v);
        System.out.println("");
        System.out.println("ORDENADO");
        Metodo.ImprimirCar(v);
    }

}
