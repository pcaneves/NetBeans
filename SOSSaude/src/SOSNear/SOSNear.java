package SOSNear;

import static java.lang.System.exit;
import javax.swing.JOptionPane;

public class SOSNear {

    public static void main(String[] args) throws ClassNotFoundException {

        Menu();
    }

    public static void Menu() {

        Usuario[] lstUsuario = new Usuario[100];
        Instituicao[] lstInstituicao = new Instituicao[100];

        System.out.println("SEJA EBM-VINDO!!");
        System.out.println(" ");
        int op;

        while (true) {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Login"
                        + "\n[2] - Cadastrar Usuário\n"
                        + "[3] - Cadastrar Instituição\n"
                        + "[4] - Listar usuários cadastrados\n"
                        + "[5] - Listar Instituições\n"
                        + "[6] - Excluir usuário\n"
                        + "[7] - Excluir instituição\n"
                        + "[8] - Sair \n\n"
                        + "Escolha a opção:"));

                int id;
                switch (op) {
                    case 1:
                        int i = 0;
                        if (JOptionPane.showInputDialog("Login: ").equals(lstUsuario[i].getLogin())) {
                            if (JOptionPane.showInputDialog("Senha: ").equals(lstUsuario[i].getSenha())) {

                                op = Integer.parseInt(JOptionPane.showInputDialog("[1] - Listar instituições"
                                        + "\n[2] - Favoritar"
                                        + "\n[3] - Sair \n"));

                                switch (op) {
                                    case 1:
                                        Instituicao.Exibir(lstInstituicao);
                                        break;

                                    case 2:
                                        id = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ID: "));
                                        Usuario.Favoritar(id);
                                        break;
                                    case 3:
                                        exit(0);
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Operação inválida!", "AVISO", JOptionPane.WARNING_MESSAGE);

                                }
                            } else {
                                System.out.println("Usuário não encontrado, ou está entrando com dados incorretos ou uma instituição. Favor verificar.");
                            }
                        }

                        break;

                    case 2:
                        Usuario.Cadastrar(lstUsuario);
                        break;
                    case 3:
                        Instituicao.Cadastrar(lstInstituicao);
                        break;
                    case 4:
                        Usuario.Exibir(lstUsuario);
                        break;

                    case 5:
                        Instituicao.Exibir(lstInstituicao);
                        break;
                    case 6:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do Usuário: "));
                        Usuario.Remover(lstUsuario, id);
                        break;
                    case 7:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID da Instituição: "));
                        Instituicao.Remover(lstInstituicao, id);
                        break;

                    case 8:
                        System.exit(0);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Operação inválida!", "AVISO", JOptionPane.WARNING_MESSAGE);
                }

            } catch (NumberFormatException e) {
                System.exit(0);
            }
        }
    }
}
