package EX8;

public class EX8 {

    public static void main(String[] args) {
        int i = 13, count = 0, soma = 0, media;

        while (i <= 73) {
            if (i % 2 == 0) {
                count++;
                soma += i;
            }
            i++;
        }
        
        media = soma / count;
        System.out.println("A média aritimética dos números pares entre 13 e 73 é " + media);
    }
}
