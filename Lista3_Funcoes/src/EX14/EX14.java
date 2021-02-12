package EX14;

import java.util.Scanner;

public class EX14 {

    static Scanner input = new Scanner(System.in);

    static double entradaAlt() {
        double alt;
        System.out.println("Peso ideal");
        System.out.print("Informe sua altura (ex 1.61): ");
        alt = input.nextDouble();

        return alt;
    }

    static String entradaSexo() {
        String sexo;
        System.out.print("Informe seu sexo(F | M): ");
        sexo = input.next();

        return sexo;
    }

    static double pesoIdeal(double alt, String sexo) {
        double p = 0;

        switch (sexo) {
            case "F":
            case "f":
                p = (62.1 * alt) - 44.7;
             break;
            case "M":
            case "m":
                p = ((72.7 * alt) - 58);
                break;
            default:
                System.out.println("Informe F para feminino e M para masculino");

        }
        System.out.printf("Seu peso ideal é %6.2f", p);

        return p;
    }

    public static void main(String[] args) {
        double alt = entradaAlt();
        String sexo = entradaSexo();

        pesoIdeal(alt, sexo);
    }
}
