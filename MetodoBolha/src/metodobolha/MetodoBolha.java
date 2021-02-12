
package metodobolha;


public class MetodoBolha {


    public static void main(String[] args) {
        char [] a = new char[5];
        
        Bubble.Inserir(a);
        System.out.println("== Valor original ==");
        Bubble.Imprimir(a);
        System.out.println("== Valor ordenado ==");
        Bubble.BubbleSort(a);
        Bubble.Imprimir(a);
    }
    
}
