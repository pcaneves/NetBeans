package SOSNear;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SOSNearDAO {

    private final String USUARIO = "root";
    private final String SENHA = "";
    private final String URL = "jdbc:mysql://localhost:3306/sosnear";
    private Connection con = null;

    public Connection Conectar() throws SQLException, ClassNotFoundException {
         return con = DriverManager.getConnection(URL, USUARIO, SENHA);
    }

}
