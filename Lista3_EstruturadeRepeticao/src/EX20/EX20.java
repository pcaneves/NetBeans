package EX20;

import java.util.Scanner;

public class EX20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldo, valor;
        int op;

        System.out.println("-- CONTA BANCÁRIA --");
        System.out.print("Informe o saldo de sua conta: ");
        saldo = input.nextDouble();

        System.out.println("-- OPERAÇÕES --");

        do {
            System.out.println("Digite:");
            System.out.println("1) Depósito");
            System.out.println("2) Saque");
            System.out.println("3) Sair");
            op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Informe o valor que deseja depositar: ");
                    valor = input.nextDouble();
                    saldo += valor;
                    break;
                case 2:
                    System.out.print("Informe o valor que deseja sacar: ");
                    valor = input.nextDouble();
                    saldo -= valor;
                    break;
                case 3:
                    System.out.println("___________________________________________");
                    System.out.println("Saldo" + saldo);
                    if (saldo == 0) {
                        System.out.println("CONTA ZERADA");
                    } else if (saldo < 0) {
                        System.out.println("CONTA ESTOURADA");
                    } else {
                        System.out.println("CONTA PREFERENCIAL");
                    }
                    System.out.println("Até a próxima!!");
                    break;
            }
        } while (op != 3);
    }
}
