package EX03;

public class EX03 {

    public static void main(String[] args) {
        int fibo[] = new int[15];
        fibo[0] = 1;
        fibo[1] = 1;
        System.out.println(fibo[0] + "\n" + fibo[1]);
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            System.out.println(fibo[i]);

        }
    }
}