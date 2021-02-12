package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    private final String USUARIO = "root";
    private final String SENHA = "";
    private final String URL = "jdbc:mysql://localhost:3306/cliente_bd";
    private Connection con = null;
    private PreparedStatement st;
    private ResultSet rs;

    public Connection Iniciar() throws SQLException {
        return con = DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public void Inserir(Cliente client, Connection con) throws SQLException {
        try {
            String sql = "INSERT INTO cliente(nome,email, telefone) VALUES(?, ?, ?)";
            st = con.prepareStatement(sql);
            st.setString(1, client.getNome());
            st.setString(2, client.getEmail());
            st.setString(3, client.getTelefone());
            st.executeUpdate();

            System.out.println("Inserido com secessucesso!");
        } finally {
            con.close();
            st.close();
        }
    }

    public List<Cliente> Listar(Connection con) throws SQLException {
        List<Cliente> lista = new ArrayList<>();

        try {
            String sql = "SELECT * FROM cliente ORDER BY nome";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();

            Cliente cliente;
            while (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));                
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                lista.add(cliente);
            }

        } finally {
            con.close();
            st.close();
        }
        return lista;
    }
}
