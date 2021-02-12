package EX17;

import java.util.Scanner;

public class EX17 {

    static Scanner input = new Scanner(System.in);

    static int entradaX() {
        int n;
        System.out.println("POTÊNCIA");
        System.out.print("Informe o número da base: ");
        n = input.nextInt();

        return n;
    }

    static int entradaZ() {
        int n;
        System.out.print("Informe o número do expoente: ");
        n = input.nextInt();

        return n;
    }

    static int potencia(int x, int z) {
        int result = 1;

        for (int i = 0; i < z; i++) {
            result *= x;
        }
        System.out.println("-------------------------");
        System.out.println(x + "^" + z + "=" + result);
        return result;
    }

    public static void main(String[] args) {
        int x = entradaX();
        int z = entradaZ();
        
        potencia(x, z);
    }
}
