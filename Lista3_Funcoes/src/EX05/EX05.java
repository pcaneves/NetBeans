package EX05;

import java.util.Scanner;

class EX05 {

    static Scanner input = new Scanner(System.in);

    static int entrada() {
        int n;

        System.out.println("Divisão (FATORIAL/SOMA)");
        System.out.print("Informe um número: ");
        n = input.nextInt();
        return n;
    }

    static int fatorial(int n) {
        int fat = 1, i = 2;

        if (n > 0) {
            while (i <= n) {
                fat = fat * i;
                i++;
            }
        } else {
            System.out.println("Não possível calcular o fatorial de um número negativo!");
        }
        return fat;
    }

    static int somaNumeros(int n) {
        int i, soma = 0;

        for (i = 1; i <= n; i++) {
            soma = soma + i;
        }
        return soma;
    }

    static double divisao(int fat, int soma) {
        double result;

        result = fat / soma;
        System.out.println(fat + "/" + soma + "=" + result);

        return result;
    }

    public static void main(String[] args) {
        int n1 = entrada();
        int fat = fatorial(n1);
        int soma = somaNumeros(n1);
        divisao(fat, soma);

    }
}
