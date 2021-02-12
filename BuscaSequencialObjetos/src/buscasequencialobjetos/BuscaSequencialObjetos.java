package buscasequencialobjetos;

public class BuscaSequencialObjetos {

    public static void main(String[] args) {
        Pessoa[] lista = new Pessoa[3];
        Metodos.Inserir(lista);

        System.out.println("");
        System.out.println("==BUSCA==");

        System.out.print("Informe o ID da pessoa que deseja buscar: ");
        int id = Metodos.input.nextInt();
        Pessoa p = Metodos.Linear(lista, id);

        if (p != null) {
            System.out.println("ID: " + p.id);
            System.out.println("Nome:  " + p.nome);
            System.out.println("Idade: " + p.idade);
        } else {
            System.out.println("Esse cadastro não existe");
        }
    }

}
