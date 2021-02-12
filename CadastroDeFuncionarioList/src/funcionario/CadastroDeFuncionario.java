package funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeFuncionario {

    public static final int MAX = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        System.out.println("Inserindo valores");
        Operacoes.inserir(lista, MAX);
        System.out.println("Exibindo valores");
        Operacoes.exibir(lista);

        int x;
        System.out.print("\nInforme o ID que deseja pesquisar: ");
        x = input.nextInt();

        Funcionario f = Operacoes.pesquisarId(lista, x);

        if (f != null) {
            System.out.println("Id: " + f.getId());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Cargo: " + f.getCargo());
            System.out.println("Salário: " + f.getSalario());

        } else {
            System.out.println("Esse cadastro não existe");
        }
    }
}
