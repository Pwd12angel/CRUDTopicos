import java.sql.Connection;

public class inicio {
    public static void main(String[] args) {
        Conexion cn = new Conexion();

        try (Connection cnx = cn.get_Connection()){

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
