package EX03;

import java.util.Scanner;

public class ListaCompra {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float soma = 0;
        Produto p[] = new Produto[3];

        for (int i = 0; i < p.length; i++) {

            p[i] = new Produto();

            System.out.print("Código: ");
            p[i].codigo = input.nextInt();
            System.out.print("Categoria: ");
            p[i].categoria = input.next();
            System.out.print("Nome: ");
            p[i].nome = input.next();
            System.out.print("Preço: ");
            p[i].preco = input.nextFloat();
            System.out.println("______________________");

            soma += p[i].preco;

        }

        System.out.print("Cód" + " ");
        System.out.print("Categoria" + " ");
        System.out.print("Nome" + " ");
        System.out.println("Preço" + "'");
        for (int i = 0; i < p.length; i++) {

            System.out.print(p[i].codigo + " ");
            System.out.print(p[i].categoria + " ");
            System.out.print(p[i].nome + " ");
            System.out.print(p[i].preco + " ");

            System.out.print("\n");

        }
        
        System.out.println("TOTAL = " + soma);

    }
}
