import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_Connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/topicos","root","root123");

            if (connection != null){
                System.out.println("Conexion exitosa");
            }
        }catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
}
