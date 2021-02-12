package EX3;

import java.util.Scanner;

public class EX3 {
     public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int valor, tamValor, qtdCed_100, qtdCed_50, qtdCed_20, qtdCed_10, qtdCed_5, qtdCed_1;
          
        System.out.print("Informe o valor que irá sacar: ");
        valor = input.nextInt();
        
        qtdCed_100 = valor/100;
        qtdCed_50 = (valor-qtdCed_100*100)/50;
        qtdCed_20 = (valor-qtdCed_100*100-qtdCed_50*50)/20;
        qtdCed_10 = (valor-qtdCed_100*100-qtdCed_50*50-qtdCed_20*20)/10;
        qtdCed_5 = (valor-qtdCed_100*100-qtdCed_50*50-qtdCed_20*20-qtdCed_10*10)/5;
        qtdCed_1 = (valor-qtdCed_100*100-qtdCed_50*50-qtdCed_20*20-qtdCed_10*10-qtdCed_5*5);
        
        String valor1 = Integer.toString(valor);
        tamValor = valor1.length();
     
         System.out.println("As notas em contagem são: ");
      
         switch(tamValor) {
            case 3:
            case 4:    
            case 5:    
            case 6:    
            case 7:
            case 8:
            case 9:    
                System.out.println(qtdCed_100 + " nota(s) de R$ 100.");
                break;
            default: System.out.print("");
                break;
        } 
        switch(qtdCed_50) {
            case 1: System.out.println(qtdCed_50 + " nota(s) de R$ 50.");
                break;                
            default: System.out.print("");
                break;
        } 
        switch(qtdCed_20) {
            case 1:
            case 2:    
                System.out.println(qtdCed_20 + " nota(s) de R$ 20.");
                break;
            default: System.out.print("");
                break;
        } 
        switch(qtdCed_10) {
            case 1: System.out.println(qtdCed_10 + " nota(s) de R$ 10.");
                break;
            default: System.out.print("");
                break;
        } switch(qtdCed_5) {
            case 1: System.out.println(qtdCed_5 + " nota(s) de R$ 5.");
                break;
            default: System.out.print("");
                break;
        } switch(qtdCed_1) {
            case 1: 
            case 2:    
            case 3:
            case 4:    
                System.out.println(qtdCed_1 + " nota(s) de R$ 1."); 
                break;
            default: System.out.print("");
                break;
        }           
     }
}
