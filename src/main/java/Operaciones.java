import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operaciones {
    //Operaciones que se aran para posteriormente enviar a la base de datos
    //crear un alumno
    public static void crearAlumno(alumno alumno){ //resive un objeto
        //generamos la conexion a la base de datos
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.get_Connection()){
            PreparedStatement ps = null;
            try{
               String query = "INSERT INTO alumnos (Nombre, edad, Numero_c) VALUES ( ?,?,?)";
               //le pasasmos como parametro la consulta
               ps = conexion.prepareStatement(query);
               //le pasasmos el parametro de la clase alumno
               ps.setString(1,alumno.getNombre());
               ps.setInt(2,alumno.getEdad());
               ps.setInt(3,alumno.getNumerode_c());

               //ejecutamos
                ps.executeUpdate();
                System.out.println("Alumno registrado correctamente");
            }catch (SQLException ex){
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void consultarAlumno(){

    }
    public static void eliminarAlumno(int id_alumno){

    }
    public static void agregarAlumno(alumno alumno){
    }


}
