package Desafio;

import java.util.Scanner;

public class Desafio {

    static Scanner input = new Scanner(System.in);
    static double soma, subtracao, multiplicacao, divisao, raiz, potencia, n1, n2;

    static double soma(double n1, double n2) {
        soma = n1 + n2;
        return soma;
    }

    static double multiplicacao(double n1, double n2) {
        multiplicacao = n1 * n2;
        return multiplicacao;
    }

    static double subtracao(double n1, double n2) {
        subtracao = n1 / n2;
        return subtracao;
    }

    static double divisao(double n1, double n2) {
        divisao = n1 / n2;
        return divisao;
    }

    static double raiz(double n1) {
        raiz = Math.pow(n1, 2);
        return raiz;
    }

    static double potencia(double n1, double n2) {
        potencia = Math.pow(n1, n2);
        return potencia;
    }

    public static void main(String[] args) {
        int op;
        System.out.println("-- CACLULADORA --");
        System.out.println("*******************************");
        do {
            System.out.println("Digite:");
            System.out.println("1) Adição");
            System.out.println("2) Multiplicação");
            System.out.println("3) Subtração");
            System.out.println("4) Divisão");
            System.out.println("5) Raiz");
            System.out.println("6) Potenciação");
            System.out.println("0) Sair da calculadora");
            op = input.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Até a próxima!");
                    break;
                case 1:
                    System.out.println("Informe dois número para efetuar a soma");
                    System.out.print("1º número: ");
                    n1 = input.nextDouble();
                    System.out.print("2º número: ");
                    n2 = input.nextDouble();
                    soma(n1, n2);
                    System.out.println(n1 + "+" + n2 + "=" + soma);
                    System.out.println("-----------------");
                    break;
                case 2:
                    System.out.println("Informe dois número para efetuar a multiplicação");
                    System.out.print("1º número: ");
                    n1 = input.nextDouble();
                    System.out.print("2º número: ");
                    n2 = input.nextDouble();
                    multiplicacao(n1, n2);
                    System.out.println(n1 + "*" + n2 + "=" + multiplicacao);
                    System.out.println("-----------------");
                    break;
                case 3:
                    System.out.println("Informe dois número para efetuar a subtração");
                    System.out.print("1º número: ");
                    n1 = input.nextDouble();
                    System.out.print("2º número: ");
                    n2 = input.nextDouble();
                    subtracao(n1, n2);
                    System.out.println(n1 + "-" + n2 + "=" + subtracao);
                    System.out.println("-----------------");
                    break;
                case 4:
                    System.out.println("Informe dois número para efetuar a divisão");
                    System.out.print("1º número: ");
                    n1 = input.nextDouble();
                    System.out.print("2º número: ");
                    n2 = input.nextDouble();
                    divisao(n1, n2);
                    System.out.println(n1 + "/" + n2 + "=" + divisao);
                    System.out.println("-----------------");
                    break;
                case 5:
                    System.out.print("Informe dois número para encontrar a raiz: ");
                    n1 = input.nextDouble();
                    raiz(n1);
                    System.out.println(n1 + "^2" + "=" + raiz);
                    System.out.println("-----------------");
                    break;
                case 6:
                    System.out.print("Potenciação");
                    System.out.print("Informe o número da base: ");
                    n1 = input.nextDouble();
                    System.out.print("Informe o número do expoente: ");
                    n2 = input.nextDouble();
                    potencia(n1, n2);
                    System.out.println(n1 + "^" + n2 + "=" + potencia);
                    System.out.println("-----------------");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println("-----------------");
                    break;
            }
        } while (op != 0);
    }

}
