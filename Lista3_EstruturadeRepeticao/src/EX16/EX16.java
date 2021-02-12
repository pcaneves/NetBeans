package EX16;

import java.util.Scanner;

public class EX16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i = 1, nPIPN;
        System.out.print("Infome um número: ");
        n = input.nextInt();

        do {
            System.out.print("Informe o " + i + "º número: ");
            nPIPN = input.nextInt();

            if (nPIPN == 0) {
                System.out.println(nPIPN + "é NULO");
            } else if (nPIPN > 0) {
                System.out.println(nPIPN + " é POSITIVO");
            } else {

                System.out.println(nPIPN + " é NEGATIVO");
            }
            if (nPIPN % 2 == 0) {
                System.out.println(nPIPN + " é PAR");
            } else {
                System.out.println(nPIPN + " é ÍMPAR");
            }
            i++;
        } while (i <= n);

    }
}
