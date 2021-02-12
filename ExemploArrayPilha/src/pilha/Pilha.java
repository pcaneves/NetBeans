package pilha;

public class Pilha {

    private static int t = 0;

    public static void pop(int[] pilha) {
        if (!empty(pilha)) {
            t--;
        } else {
            System.out.println("Pilha vazia!");
        }
    }

    public static void push(int[] pilha, int n) {
        if (!full(pilha)) {
            pilha[t++] = n;
        } else {

            System.out.println("Pilha cheia!");
        }

    }

    public static boolean empty(int[] pilha) {
        return t == 0;
    }

    public static boolean full(int[] pilha) {
        return t == pilha.length;
    }

    public static int top(int[] pilha) {
        return pilha[t];
    }

    public static void exibir(int[] pilha) {
        for (int i=t-1; i >= 0; i--) {
            System.out.println("Pilha |" + i + "|= " + pilha[i]);
        }
    }

}
