package buscabinaria;

import javax.swing.JOptionPane;

public class BuscaBinaria {

    public static void main(String[] args) {

        int[] v = new int[100];

        Metodos.Popular(v);
        Metodos.Ordenar(v);
        // int[] v = {2, 4, 5, 6, 12, 34, 67};
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        int r = Metodos.Binaria(v, b);
        JOptionPane.showMessageDialog(null, "Índice: " + r);

    }

}
