package EX19;

import java.util.Scanner;

public class EX19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senha = 2002, x = 0;

        while (x != 2002) {
            System.out.print("Por favor, informe a senha: ");
            x = input.nextInt();

            if (x == senha) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha inválida!");
            }
        }
    }
}
