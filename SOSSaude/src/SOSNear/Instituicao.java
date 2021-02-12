package SOSNear;

import java.util.Random;
import javax.swing.JOptionPane;

public class Instituicao {

    private int id;
    private String nome, email, login, senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static int x = 0;

    private static boolean cheio(Instituicao[] lista) {
        return x == lista.length;
    }

    private static int gerarId(Instituicao[] lista) {
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

    public static void Cadastrar(Instituicao[] lista) {

        try {
            if (!cheio(lista)) {
                lista[x] = new Instituicao();
                lista[x].setId(gerarId(lista));
                lista[x].setNome(JOptionPane.showInputDialog("Nome: "));
                lista[x].setEmail(JOptionPane.showInputDialog("E-mail: "));
                lista[x].setLogin(JOptionPane.showInputDialog("Login: "));
                lista[x].setSenha(JOptionPane.showInputDialog("Senha: "));
                x++;
            } else {
                JOptionPane.showMessageDialog(null, "Cadastro cheio!");
            }
        } catch (NumberFormatException e) {
            SOSNear.Menu();
        }
    }

    private static boolean empty() {
        return x == 0;
    }

    private static void Ordenar(Instituicao[] lista) {
        int j;
        Instituicao temp;
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

    public static void Exibir(Instituicao[] lista) {
        if (!empty()) {
            Ordenar(lista);
            String s = "";
            for (int i = 0; i < x; i++) {
                s += lista[i].getId() + ". " + lista[i].getNome();
                s += "\nE-mail: " + lista[i].getEmail();
                s += "\nLogin: " + lista[i].getLogin() + "\n\n";
            }
            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "SEM INSTITUIÇÕES  CADASTRADOS!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }
    
       public static int BuscarPorId(Instituicao[] lista, int id) {
        int inicio = 0, fim = x - 1;
        int central;
        String s = "";
        while (inicio <= fim) {
            central = (fim + inicio) / 2;
            if (id == lista[central].getId()) {
                return central;

            } else if (id > lista[central].getId()) {
                inicio = central + 1;
            } else {
                fim = central - 1;
            }
        }
        return -1;
    }

    public static boolean Remover(Instituicao[] lista, int id) {

        int indice = BuscarPorId(lista, id);
        if (indice != -1) {
            int j;
            for (j = indice + 1; j < lista.length; ++j) {
                lista[j - 1] = lista[j];
            }
            x--;
           JOptionPane.showMessageDialog(null, "INSTITUICÃO REMOVIDA COM SUCESSO!", "AVISO", JOptionPane.WARNING_MESSAGE);
            return true;
        } else {
              JOptionPane.showMessageDialog(null, "ERRO AO REMOVER INSTITUIÇÃO!", "AVISO", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

}
