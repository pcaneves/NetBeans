package av_ex02;

import java.util.Scanner;

public class Principal {

    static Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        int t;
        System.out.print("Informe um tamanho para o array: ");
        t = input.nextInt();

        int v[] = new int[t];
        Metodos.Popular(v);
        Metodos.Exibir(v);
    }
}
