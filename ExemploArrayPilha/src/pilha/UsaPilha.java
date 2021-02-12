package pilha;

import java.util.Scanner;

public class UsaPilha {

    public static void main(String[] args) {
        int pilha[] = new int[5];

        Scanner input = new Scanner(System.in);
        int op, n = 10;

        while (true) {
            System.out.print("Opção <<");
            op = input.nextInt();

            switch (op) {
                case 1:
                    Pilha.push(pilha, n);
                    break;
                case 2:
                    Pilha.pop(pilha);
                    break;
                case 3:
                    System.out.println(Pilha.top(pilha));
                    break;
                case 4:
                    System.out.println(Pilha.empty(pilha));
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção invaalida");
            }
            Pilha.exibir(pilha);
            n++;
        }

    }

}
