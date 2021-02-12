package EX04;

import java.util.Random;
import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, tentativa;
        Random rand = new Random();

        n = rand.nextInt(50);

        System.out.println(n);

        System.out.println("-------------------");

        System.out.println("Adivinhe o número sorteado entre 0 e 50");

        for (int i = 0; i < 6; i++) {
            System.out.print(i + "º TENTATIVA: ");
            tentativa = input.nextInt();

            if ((tentativa < 0) || (tentativa > 50)) {
                System.out.println("Valor da tentativa inválido!");
                System.out.print(i + "º TENTATIVA: ");
                tentativa = input.nextInt();
            }

            if (tentativa == n) {
                System.out.println("Parabéns! Você acertou o número sorteado!");
                System.out.println("O número sorteado foi: " + n);
                break;
            }

        }
        System.out.println("Suas tentativas acabaram! Tente novamente mais tarde!");
        System.out.println("O número sorteado foi: " + n);

    }
}
