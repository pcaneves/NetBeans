package EX01;

public class Ex01 {

    public static void main(String[] args) {
        long n = 3;
        System.out.println(n + "º termo= " + Triangular(n));
    }

    public static long Triangular(long n) {
        if (n <= 1) {
            return 1;
        }
        return n + Triangular(n-1);
    }
}
