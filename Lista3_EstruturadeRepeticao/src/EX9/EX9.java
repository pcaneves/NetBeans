package EX9;

import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alunosTurma, i = 1;
        double nota, soma = 0, media;

        System.out.print("Infome quantos alunos tem a turma: ");
        alunosTurma = input.nextInt();

        while (i <= alunosTurma) {
            System.out.print("Informe a nota do " + i + "º: ");
            nota = input.nextInt();
            i++;
            soma += nota;
        }

        media = soma / alunosTurma;
        System.out.println("A média da nota dos " + alunosTurma + " alunos é " + media);
    }

}
