package EX03;

import java.util.Scanner;

public class EX03 {

    static Scanner input = new Scanner(System.in);
    
    static int somaNumeros (int n){
    int i , soma= 0;
    
    for (i = 1; i <= n; i++) {
                soma = soma + i;                           
    }
    System.out.println("A soma dos número inteiros menores e igual a " + n + " é " + soma);
    return soma;
    }

    public static void main(String[] args) {
        int n;        
        System.out.print("Informe o valor de N: ");
        n = input.nextInt();
        
        somaNumeros(n);
    }

}
