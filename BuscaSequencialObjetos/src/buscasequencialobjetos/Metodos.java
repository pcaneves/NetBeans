package buscasequencialobjetos;

import java.util.Scanner;

public class Metodos {

    public static Scanner input = new Scanner(System.in);
    public static void Inserir(Pessoa[] lista) {
               
        for (int i = 0; i<lista.length; i++){
        lista[i] = new Pessoa();
            System.out.print("Nome: ");
            lista[i].nome=input.next();
            System.out.print("Idade: ");
            lista[i].idade=input.nextInt();
            //Auto incremento
            lista[i].id=i+1;
            System.out.println("");
        }

    }
    
       public static Pessoa Linear(Pessoa[] lista, int id) {
        for (int i = 0; i < lista.length; i++) {
            if (id == lista[i].id) {
                return lista[i];
            }
        }
        return null;
    }

}
