package EX16;

import java.util.Scanner;

public class EX16 {

    static Scanner input = new Scanner(System.in);

    static int entrada (){
        int n;
        System.out.println("DIVISORES");
        System.out.print("Informe um número: ");
        n = input.nextInt();
        
        return n;
    }
    
    static int divisores(int n) {
        int i;
        System.out.println("Os devisores de " + n + " são: ");
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        return i;
    }
    

    public static void main(String[] args) {
        int n = entrada();
        divisores(n);        
    }

}
