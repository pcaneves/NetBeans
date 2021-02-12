package EX09;

import java.util.Scanner;

public class EX09 {

    static Scanner input = new Scanner(System.in);

     static float entrada (){
       float r;

        System.out.println("Calculo do volume do circulo");
        System.out.print("Inoforme o valor do raio: ");
        r = input.nextInt();
        
        return r;
    }
     
    static float volumeCirculo(float r) {
        double v;
       
        v = (4 / 3) * 3.14 * (Math.pow(r, 3));
        System.out.println("---------------------");
        System.out.println("O volume do circurlo de raio " + r + " é " + v);

        return (float) v;
    }

    public static void main(String[] args) {
        float r = entrada();
        volumeCirculo(r);
    }

}
