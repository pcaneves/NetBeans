package prova.cadastrofuncionario;

import javax.swing.JOptionPane;

public class PROVACadastroFuncionario {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        Funcionario[] lstFuncionario = new Funcionario[100];

        System.out.println("SEJA EBM-VINDO!!");
        System.out.println(" ");
        int op;

        while (true) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Cadastrar funcionário"
                        + "\n[2] - Buscar funcionário\n"
                        + "[3] - Atualizar salário\n"
                        + "[4] - Remover funcionário\n"
                        + "[5] - Verificar salários\n"
                        + "[6] - Verificar salário liquído\n"
                        + "[7] - TODOS FUNCIONÁRIOS\n"
                        + "[8] - Sair \n\n"
                        + "Escolha a opção:"));

                int id;
                switch (op) {
                    case 1:
                        Metodo.Cadastrar(lstFuncionario);
                        break;
                    case 2:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Funcionário: "));
                       int f = Metodo.BuscarPorId(lstFuncionario, id);                       
                       if (f == -1){
                            JOptionPane.showMessageDialog(null, "Funcionario não encontardo!", "AVISO",JOptionPane.WARNING_MESSAGE);
                        }
                        break;
                    case 3:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Funcionário: "));
                        Metodo.AtualizarSalario(lstFuncionario, id);
                        break;
                    case 4:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Funcionário: "));
                        if (Metodo.Remover(lstFuncionario, id)) {
                            JOptionPane.showMessageDialog(null, "Funcionário, removido com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Funcionário não encontrada!");
                        }
                        break;

                    case 5:
                        Metodo.VerificarSalario(lstFuncionario);
                        break;
                    case 6:
                        Metodo.CalcularSalLiquido(lstFuncionario);
                        break;
                    case 7:
                        Metodo.Exibir(lstFuncionario);
                        break;

                    case 8:
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Operação inválida!",
                                "AVISO", JOptionPane.WARNING_MESSAGE);
                }

            } catch (NumberFormatException e) {
                System.exit(0);
            }
        }

    }

}
