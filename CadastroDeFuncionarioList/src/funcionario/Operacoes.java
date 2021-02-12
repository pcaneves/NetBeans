package funcionario;

import java.util.Scanner;
import java.util.List;

public class Operacoes {

    public static void inserir(List<Funcionario> lista, int tamanho) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            //Instanciando a classe Funcionario
            Funcionario funcionario = new Funcionario();
            //Atribuindo valores
            System.out.print("Nome: ");
            funcionario.setNome(input.nextLine());
            System.out.print("Cargo: ");
            funcionario.setCargo(input.next());
            System.out.print("Salário: ");
            funcionario.setSalario(input.nextDouble());
            System.out.print("Id: ");
            funcionario.setId(input.nextInt());
            //Adicionando um objeto à lista
            lista.add(funcionario);
        }
    }

    public static void exibir(List<Funcionario> lista) {
        for (Funcionario f : lista) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Cargo: " + f.getCargo());
            System.out.println("Salário: " + f.getSalario());
            System.out.println("Id: " + f.getId());
        }
    }

    public static Funcionario pesquisarId(List<Funcionario> lista, int id) {
        for (Funcionario f : lista) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }
}
