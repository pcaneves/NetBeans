package Carro;

import java.util.Scanner;

public class CarroArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Carro car[] = new Carro[2];

        // <= porque iniciei na posição 1 (i=1)
        for (int i = 1; i < car.length; i++) {
            car[i] = new Carro();

            System.out.println("Informe os dados do " + i + "º carro");

            System.out.print("Ano: ");
            car[i].ano = input.nextInt();
            System.out.print("Marca: ");
            car[i].marca = input.next();
            System.out.print("Preço: ");
            car[i].preco = input.nextFloat();
            System.out.println("______________________");
        }

        System.out.println("==== Saída ====");
        for (int i = 1; i < car.length; i++) {
            System.out.println(i + "º carro");
            System.out.println("Marca: " + car[i].marca);
            System.out.println("ano: " + car[i].ano);
            System.out.println("Preço: " + car[i].preco);
            System.out.println("============");
        }

    }
}
