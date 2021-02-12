package EX8;

import java.util.Scanner;


public class EX8 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      double anuidade, multa, vTotal;
      int mes;
      double juros = 0.05;
      
        System.out.println("Anuidade");
        System.out.print("Informe o valor da sua anuidade: ");
        anuidade = input.nextDouble();
        System.out.print("Informe o mês em que em que irá realizar o pagamento (1-12): ");
        mes = input.nextInt();
            
        switch (mes) {
            case 1:
                System.out.println("Pago em janeiro");
                System.out.println("O valor a ser pago é " + anuidade + "pois não houve atraso");
                break;
    
            case 2:                       
                multa = anuidade * juros;
                vTotal = anuidade + multa;
                System.out.println("Pago em fevereiro");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 1 mês");
           
            case 3:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                System.out.println("Pago em fevereiro");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 1 mês");
                break;  
         
            case 4:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em abril");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 3 meses");
                break;
         
            case 5:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em maio");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 4 meses");
                break;
                
            case 6:
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em junho");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 5 meses");
                break;
            
            case 7:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em julho");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 6 meses");
                break; 
            
            case 8:    
               vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em agosto");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 7 meses");
          
            case 9:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em setembro");
                System.out.println("O valor a ser pago é " +vTotal + "pois houve atraso de 8 meses");
            
            case 10:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em outubro");
                System.out.println("O valor a ser pago é " +vTotal + "pois houve atraso de 9 meses");
         
            case 11:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em novembro");
                System.out.println("O valor a ser pago é " +vTotal + "pois houve atraso de 10 meses");               
         
            case 12:    
                vTotal = anuidade + (anuidade * juros);
                vTotal = vTotal + (vTotal * juros);                    
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                vTotal = vTotal + (vTotal * juros);
                System.out.println("Pago em Dezembro");
                System.out.println("O valor a ser pago é " +vTotal + " pois houve atraso de 11 meses");
    }     
}
}        