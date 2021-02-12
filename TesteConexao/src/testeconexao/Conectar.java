package testeconexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Conectar {

    public static void main(String[] args) throws SQLException {
        TesteDao dao = new TesteDao();

       /* try {
            Connection con;
            con = dao.testeConectar();
            System.out.println("CONECTADO");
            List<Administrador> lst = dao.Listar(con);
            for (Administrador a : lst) {
                System.out.println(a);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
              Connection con = (Connection) TesteDao.testeConectar();
               TesteDao.Listar(con);


    }
}
