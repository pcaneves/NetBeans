package EX10;

class EX10 {

    public static void main(String[] args) {
        int i;
        double soma = 0;

        for (i = 1; i <= 20; i++) {
            soma = soma + (1 / (double) i);
        }
        System.out.println("Soma: " + soma);
    }
}
