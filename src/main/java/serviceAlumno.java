import java.util.Scanner;

public class serviceAlumno {

    //Metodos que se conectaran con la clase Operaciones

    public static void crearAlumno(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el nombre del alumno");
        String nombre = leer.next();

        System.out.println("Ingresa la edad del alumno");
        int edad = leer.nextInt();

        System.out.println("Ingresa el numero de control del alumno");
        int nc = leer.nextInt();

        alumno registro = new alumno();

        //Utilizamos los metodos set
        registro.setNombre(nombre);
        registro.setEdad(edad);
        registro.setNumerode_c(nc);

        //emviamos a operaciones

        Operaciones.crearAlumno(registro);
    }
    public static void eliminarAlumno(){

    }
    public static void actualizarAlumno(){

    }
    public static void consultarAlumno(){

    }
}
