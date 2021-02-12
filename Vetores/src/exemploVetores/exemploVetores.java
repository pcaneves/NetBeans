package exemploVetores;

import java.util.Scanner;

public class exemploVetores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int v[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            v[i] = input.nextInt();
        }

        int soma = 0;
        int menor = v[0];
        int maior = v[0];

        for (int i = 0; i < n; i++) {
            soma = soma + v[i];

            if (v[i] < menor) {
                menor = v[i];
            }
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        System.out.println("---------------------");
        for (int i = 0; i < n; i++) {

            System.out.print("v[" + i + "]: " + v[i]);

            if(v[i] == menor) {
                System.out.print(" <-- menor");
            }
            if(v[i] == maior) {
                System.out.print(" <-- maior");
            }            
            System.out.println("");
        }
        System.out.println("A soma é: " + soma);

    }

}
