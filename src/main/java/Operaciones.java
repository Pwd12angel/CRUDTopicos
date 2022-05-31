import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        //generamos la conexion a la base de datos
        Conexion db_connect = new Conexion();
        PreparedStatement ps = null;
        //nos trae los datos en filas
        ResultSet rs = null;

        try (Connection conexion = db_connect.get_Connection()){
            String query = "SELECT * FROM alumnos";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            //leemos los datos
            while (rs.next()){
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Alumno: "+rs.getString("Nombre"));
                System.out.println("Edad: "+rs.getInt("edad"));
                System.out.println("Numero de control: "+rs.getInt("Numero_c"));
                System.out.println(" ");
            }
        } catch (Exception e) {
            System.out.println("No se puedo consultar los alumnos");
        }
    }
    public static void eliminarAlumno(int id_alumno){
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_Connection()){
            PreparedStatement ps = null;
            //consultamos a la base de datos
            try {
                String query = "DELETE FROM alumnos WHERE id = ?";
                ps = conexion.prepareStatement(query);
                ps.setInt(1,id_alumno);
                ps.executeUpdate();

                System.out.println("Mensaje borrado");
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("No se pudo borrar el mensaje");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void actualizarAlumno(alumno alumno){
        Conexion db_connect = new Conexion();

        try (Connection conexion = db_connect.get_Connection()){
            PreparedStatement ps = null;
            try {
                String query = "UPDATE alumnos SET Nombre = ?, edad = ?, Numero_c = ? WHERE id = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1,alumno.getNombre());
                ps.setInt(2,alumno.getEdad());
                ps.setInt(3,alumno.getNumerode_c());
                ps.setInt(4,alumno.getId());
                ps.executeUpdate();

                System.out.println("Actualizacion realizada");

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("No se pudo actualizar el dato");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
