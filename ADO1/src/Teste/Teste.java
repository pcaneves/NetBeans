package Teste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe uma letra: ");
        String letra = input.next();
        letra = letra.toUpperCase();
        
        System.out.println(letra);

    }
}
