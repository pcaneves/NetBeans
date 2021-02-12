package EX12;

import java.util.Scanner;

public class EX12 {

    static Scanner input = new Scanner(System.in);

    static int entrada (){
        int idade;
        System.out.println("Categoria nadador");
        System.out.print("Informe a idade do nadador: ");
        idade = input.nextInt();
        
        return idade;
    }
    
    static String categoriaNadador(int idade) {
        String categoria = null;
        if ((idade >= 5) && (idade <= 7)) 
            categoria = "INFANTIL A";

        if ((idade >= 8) && (idade <= 10)) 
            categoria = "INFANTIL B";
        
        if ((idade >= 11) && (idade <= 13)) 
            categoria = "JUVENIL A";
        
        if ((idade >= 14) && (idade <= 17)) 
            categoria = "JUVENIL B";
        
        if (idade >= 18) 
            categoria = "ADULTO";
        //Acrescimo próprio
        if (idade < 5)
            System.out.println("Não existe categoria para nadadores com idade inferior a 5 anos");
        
        System.out.println("O nadador é da categoria: " + categoria);
        return categoria;
    }

    public static void main(String[] args) {
        int i = entrada();
        categoriaNadador(i);
    }

}
