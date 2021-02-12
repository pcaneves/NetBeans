package Usuario;

import Modelo.Cliente;
import Modelo.ClienteDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Usuario {

    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();
        Cliente cliente = new Cliente();
        
    
        try {
            Connection con = dao.Iniciar();
            System.out.println("CONECTADO");
           // dao.Inserir(cliente, con);
           List<Cliente> lista = dao.Listar(con);
           
           for(Cliente c:lista){
               System.out.println(c);
           }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
