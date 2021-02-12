package EX1;

import java.util.Scanner;

public class EX1 {

    static Scanner input = new Scanner(System.in);

    static String status;

    static String imprimirNota(double nota) {
        if (nota >= 6) {
            status = "Aprovado!";
        } else {
            status = "Reprovado!";
        }
        return status;
    }

    public static void main(String[] args) {
        double nota;
        System.out.println("Informe a nota do aluno: ");
        nota = input.nextDouble();
        
        imprimirNota (nota);
        System.out.println(status);
        
    }
}
