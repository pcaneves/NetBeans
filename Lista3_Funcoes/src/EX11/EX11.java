package EX11;

import java.util.Scanner;

public class EX11 {

    static Scanner input = new Scanner(System.in);

    static int idade(int ano, int mes, int dia) {
        int idadeDia;

        idadeDia = (ano * 365) + (mes * 30) + dia;
        System.out.println("Sua idade em dias é igual: " + idadeDia);

        return idadeDia;
    }

    public static void main(String[] args) {
        int ano, mes, dia;

        System.out.println("Infome sua idade (em anos, meses e dias)");
        System.out.print("Informe os anos: ");
        ano = input.nextInt();
        System.out.print("Informe os meses: ");
        mes = input.nextInt();
        System.out.print("Informe os dias: ");
        dia = input.nextInt();

        idade(ano, mes, dia);

    }

}
