package contagemvogais;

import java.util.Scanner;

public class ContagemVogais {

    static Scanner input = new Scanner(System.in);

    public static String Nome() {

        String nome;
        System.out.print("Informe o nome para contar as VOGAIS: ");
        nome = input.next();

        return nome;
    }

    public static void ContaVogal(String nome) {
        nome = nome.toUpperCase();
        String vogais = "AEIOU";
        int cont = 0, i, j;

        for (i = 0; i < nome.length(); i++) {
            for (j = 0; j < vogais.length(); j++) {
                if (nome.charAt(i) == vogais.charAt(j)) {
                    cont++;
                }
            }
        }
        System.out.println(nome + " tem " + cont + " vogais!");

    }

    public static void main(String[] args) {
        String nome = Nome();
        ContaVogal(nome);

    }

}
