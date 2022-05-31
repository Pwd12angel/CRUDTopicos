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

        //mandamos a llamar desde la clase alumno
        alumno registro = new alumno();

        //Utilizamos los metodos set para meter los datos
        registro.setNombre(nombre);
        registro.setEdad(edad);
        registro.setNumerode_c(nc);

        //emviamos a operaciones

        Operaciones.crearAlumno(registro);
    }
    public static void eliminarAlumno(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Indica el id ");
        int id = leer.nextInt();

        Operaciones.eliminarAlumno(id);
    }
    public static void actualizarAlumno(){
        Scanner leer = new Scanner(System.in);

        System.out.println("Escribe el nombre");
        String n = leer.next();

        System.out.println("Escribe la edad");
        int e = leer.nextInt();

        System.out.println("Escribe el numero de control");
        int nc = leer.nextInt();

        System.out.println("Indica el id ");
        int id = leer.nextInt();

        alumno act = new alumno();

        act.setId(id);
        act.setNombre(n);
        act.setEdad(e);
        act.setNumerode_c(nc);

        Operaciones.actualizarAlumno(act);




    }
    public static void consultarAlumno(){
        Operaciones.consultarAlumno();
    }
}
