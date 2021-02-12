package ListaPessoa;

import java.util.Scanner;

public class ListaPessoa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Não inicia do 0, pois iniciei i em 1;
        Pessoa p[] = new Pessoa[3];

        
        for (int i = 1; i < p.length; i++) {
            p[i] = new Pessoa();
        
            System.out.println("Informe os dados da " + i + "º pessoa");
            System.out.print("Nome: ");
            p[i].nome = input.next();
            System.out.print("Idade: ");
            p[i].idade = input.nextInt();
            System.out.print("CPF: ");
            p[i].cpf = input.nextLong();
            System.out.println(""); 
        }
        
        System.out.println("==== Lista pessoas ====");
         for (int i = 1; i < p.length; i++) {
            System.out.println(i + "º pessoa");
            System.out.println("Nome: " + p[i].nome);
            System.out.println("Idade: " + p[i].idade);
            System.out.println("CPF: " + p[i].cpf);
            if (i == p.length) {
                System.out.println("FIM");
            } else 
                 System.out.println("======Próximo======");
            
         }
    }

}
