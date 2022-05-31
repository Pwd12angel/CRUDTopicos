import java.sql.Connection;
import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("------------------------------");
            System.out.println("Aplicasion de Alumnos");
            System.out.println("1.- Crear Alumno");
            System.out.println("2.- Listar Alumnos");
            System.out.println("3.- Eliminar Alumno");
            System.out.println("4.- Actualizar Alumnos");
            System.out.println("5.- Salir");
            op = leer.nextInt();

            switch (op){
                case 1:
                    serviceAlumno.crearAlumno();
                    break;
                case 2:
                    serviceAlumno.consultarAlumno();
                    break;
                case 3:
                    serviceAlumno.eliminarAlumno();
                    break;
                case 4:
                    serviceAlumno.actualizarAlumno();
                    break;

            }


        }while (op != 5);

    }
}
