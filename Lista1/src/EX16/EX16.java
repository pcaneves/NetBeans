package EX16;

import java.util.Scanner;


public class EX16 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
      
    int horaInicial, horaFinal, duracao;
    
        System.out.println("Duração do jogo");
            System.out.print("Informe o horário que iniciou o jogo: ");
        horaInicial = input.nextInt();
        System.out.print("Informe o horário que terminou o jogo: ");
        horaFinal = input.nextInt();
        
        
        if(horaInicial >=  horaFinal){
            duracao = (horaFinal - horaInicial + 24);
            System.out.println("A duração foi de " + duracao + " hora(s)");
            
        } else {
            duracao = horaFinal - horaInicial;
            System.out.println("A duração foi de " + duracao + " hora(s)");
        }
    }
}
