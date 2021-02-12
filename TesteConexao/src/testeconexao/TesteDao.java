package testeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TesteDao {

    public static void testeConectar()  {
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch (Exception Exececao) {
            JOptionPane.showMessageDialog(null, "SQLException: " + Exececao.getMessage(), "Erro: Carga do banco de dados", JOptionPane.INFORMATION_MESSAGE);
        }
        
        try{
            Connection Conexao = DriverManager.getConnection("jdbc:odbc:PI", "", "");
            Statement Comando = Conexao.createStatement();
        }catch (Exception Exececao) {
            JOptionPane.showMessageDialog(null, "SQLException: " + Exececao.getMessage(), "Erro: Problema ao Conectar", JOptionPane.INFORMATION_MESSAGE);
        }
      //  return null;
    }
    
       public static List<Administrador> Listar(Connection con) throws SQLException  {
        List<Administrador> lista = new ArrayList<>();

        try {
            String c = "SELECT * FROM Administrador";
            PreparedStatement st = con.prepareStatement(c);
            ResultSet rs = st.executeQuery();

            Administrador adm;
            while (rs.next()) {
                adm = new Administrador();
                adm.setId(rs.getInt("id"));
                adm.setNome(rs.getString("nome"));                
                adm.setLogin(rs.getString("login"));
                adm.setSenha(rs.getString("Senha"));
                lista.add(adm);
            }

        } finally {
            con.close();

        }
        return lista;
    }
}
