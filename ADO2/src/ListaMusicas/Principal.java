package ListaMusicas;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        int numero;
        int[] num = new int[60];
        Random r = new Random();

        for (int i = 0; i < num.length; i++) {
            numero = r.nextInt(60) + 1;
            for (int j = 0; j < num.length; j++) {
                if (numero == num[j] && j != i) {
                    numero = r.nextInt(60) + 1;
                } else {
                    num[i] = numero;
                }
            }
        }
        //Apresentar na tela o resultado
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "  ");
        }
    }
}
