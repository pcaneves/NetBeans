package EX6;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1, idade, aux = 0;
        String nome, sexo, auxNome = null, auxSexo = null;

        do {
            System.out.println("-------------------------------------");
            System.out.print("Informe o nome do " + i + "º aluno: ");
            nome = input.next();
            System.out.print("Infome o sexo de " + nome + " (F | M): ");
            sexo = input.next();
            System.out.print("Informe a idade de " + nome + ": ");
            idade = input.nextInt();
            i++;

            if (idade > aux) {
                aux = idade;
                auxNome = nome;
                auxSexo = sexo;
            }
        } while (i <= 5);

        System.out.println("------------------------");
        System.out.println("O aluno mais velho é: ");
        System.out.println("Nome: " + auxNome);
        System.out.println("Sexo: " + auxSexo);
        System.out.println("Idade: " + aux);

    }
}
