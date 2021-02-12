package EX15;

import java.util.Scanner;

public class EX15 {

    static Scanner input = new Scanner(System.in);

    static int entradaPopulacao() {
        int populacao;
        System.out.println("Pesquisa da cidade");
        System.out.print("Qual a populacao da cidade: ");
        populacao = input.nextInt();

        return populacao;
    }

    static double mediaMaiorPercentSalario(int populacao) {
        double sal, somasal = 0, maior = 0, media, percentual = 0;
        int y = 0;
        for (int i = 1; i <= populacao; i++) {
            System.out.printf("Informe o salário da %dº família: ", i);
            sal = input.nextDouble();
            
            if(maior < sal)
               maior = sal;
            
             if(sal <= 350.00){
               percentual = (y * 350.00) / populacao;
               y++;
               }

            somasal = somasal + sal;
        }
        media = somasal / populacao;
        System.out.println("----------------------------------------");
        System.out.println("A média salarial daa população é " + media);
        System.out.println("O maior sálario é: " + maior );
        System.out.printf("O percentual de pessoas com salário até R$ 350,00 é  %.0f %% \n ", percentual);
        
        return somasal;
    }

    static int mediaFilhos(int populacao) {
        int filho, somaFilho = 0, media;
        System.out.println("----------------------------------------");
        System.out.println("Média filhos");
        for (int i = 1; i <= populacao; i++) {
            System.out.printf("Quantidade de filhos que possui a %dº  família: ", i);
            filho = input.nextInt();
            somaFilho = somaFilho + filho;
        }
        media = somaFilho / populacao;
        System.out.println("----------------------------------------");
        System.out.printf("A média de filhos da população é %d ", media);
        
        return media;
    }

    public static void main(String[] args) {
       int pop = entradaPopulacao();
       mediaMaiorPercentSalario(pop);
       mediaFilhos(pop);
    }

}
