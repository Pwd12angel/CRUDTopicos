public class alumno {
    int id;
    String nombre;
    int edad;
    int numerode_c;

    public alumno(){

    }

    public alumno(int id, String nombre, int edad, int numerode_c) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.numerode_c = numerode_c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerode_c() {
        return numerode_c;
    }

    public void setNumerode_c(int numerode_c) {
        this.numerode_c = numerode_c;
    }
}
