package prova.cadastrofuncionario;

import java.util.Random;
import javax.swing.JOptionPane;

public class Metodo {

    public static int x = 0;

    private static boolean cheio(Funcionario[] lista) {
        return x == lista.length;
    }

    private static int gerarId(Funcionario[] lista) {
        Random rd = new Random();
        boolean valor;
        int n;
        do {
            valor = false;
            n = rd.nextInt(199) + 1;
            for (int i = 0; i < x; i++) {
                if (n == lista[i].getId()) {
                    valor = true;
                    break;
                }
            }
        } while (valor == true);
        return n;
    }

    public static void Cadastrar(Funcionario[] lista) {

        try {
            if (!cheio(lista)) {
                lista[x] = new Funcionario();
                lista[x].setId(gerarId(lista));
                lista[x].setNome(JOptionPane.showInputDialog("Nome: "));
                lista[x].setCargo(JOptionPane.showInputDialog("Cargo: "));
                lista[x].setSalario(Integer.parseInt(JOptionPane.showInputDialog("Salário: ")));
                x++;
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro cheio!");
            }
        } catch (NumberFormatException e) {
            PROVACadastroFuncionario.Menu();
        }
    }

    public static int BuscarPorId(Funcionario[] lista, int id) {
        int inicio = 0, fim = x - 1;
        int central;
        String s = "";
        while (inicio <= fim) {
            central = (fim + inicio) / 2;
            if (id == lista[central].getId()) {
                s += lista[central].getId() + ". " + lista[central].getNome();
                s += "\nCargo: " + lista[central].getCargo();
                s += "\nSalário: " + lista[central].getSalario() + "\n";
                JOptionPane.showMessageDialog(null, s);
                return central;

            } else if (id > lista[central].getId()) {
                inicio = central + 1;
            } else {
                fim = central - 1;
            }
        }
        return -1;
    }

    private static boolean empty() {
        return x == 0;
    }

    private static void Ordenar(Funcionario[] lista) {
        int j;
        Funcionario temp;
        for (int i = 1; i < x; i++) {
            temp = lista[i];
            j = i;
            while (j > 0 && lista[j - 1].getId() >= temp.getId()) {
                lista[j] = lista[j - 1];
                j--;
            }
            lista[j] = temp;
        }
    }

    public static void Exibir(Funcionario[] lista) {
        if (!empty()) {
            Ordenar(lista);
            String s = "";
            for (int i = 0; i < x; i++) {
                s += lista[i].getId() + ". " + lista[i].getNome();
                s += "\nCargo: " + lista[i].getCargo();
                s += "\nSalário: " + lista[i].getSalario() + "\n";
            }
            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "SEM FUNCIONÁRIOS CADASTRADOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static boolean Remover(Funcionario[] lista, int id) {

        int indice = BuscarPorId(lista, id);
        if (indice != -1) {
            int j;
            for (j = indice + 1; j < lista.length; ++j) {
                lista[j - 1] = lista[j];
            }
            x--;
            return true;
        } else {
            return false;
        }
    }

    public static void VerificarSalario(Funcionario[] lista) {
        if (!empty()) {
            Ordenar(lista);
            String s = "";
            for (int i = 0; i < x; i++) {
                s += lista[i].getId() + ". " + lista[i].getNome() + " = " + lista[i].getSalario() + "\n";

            }
            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "SEM FUNCIONÁRIOS CADASTRADOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void CalcularSalLiquido(Funcionario[] lista) {

        double desconto, salLiquido;
        String s = "";
        if (!empty()) {
            for (int i = 0; i < x; i++) {
                if (lista[x].getSalario() <= 2000.00) {
                    desconto = 0.05 * lista[x].getSalario();
                    salLiquido = lista[x].getSalario() - desconto;
                    s += lista[x].getNome() + ", \n salário bruto: " + lista[x].getSalario() + "\n salário líquido: " + salLiquido + "\n";
                }

                if ((lista[x].getSalario() > 2000.00) && (lista[x].getSalario() < 4000.00)) {
                    desconto = 0.02 * lista[x].getSalario();
                    salLiquido = lista[x].getSalario() - desconto;
                    s += lista[x].getNome() + ", \n salário bruto: " + lista[x].getSalario() + "\n salário líquido: " + salLiquido + "\n";
                }

                if (lista[x].getSalario() >= 4000.00) {
                    desconto = 0.04 * lista[x].getSalario();
                    salLiquido = lista[x].getSalario() - desconto;
                    s += lista[x].getNome() + ", \nsalário bruto: " + lista[x].getSalario() + "\n salário líquido: " + salLiquido + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "SEM FUNCIONÁRIOS CADASTRADOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }

    }

    public static void AtualizarSalario(Funcionario[] lista, int id) {
        if (!empty()) {
            String s = "";
            s += "Salário ATUAL do funcionário " + lista[id].getNome() + "(" + lista[id].getCargo() + "): " + lista[id].getSalario() + "\n";
            lista[id].setSalario(Integer.parseInt(JOptionPane.showInputDialog("Informe o novo salário: ")));
            s += "Atualizado para: " + lista[id].getSalario() + "\n";

            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "SEM FUNCIONÁRIOS CADASTRADOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }

}
