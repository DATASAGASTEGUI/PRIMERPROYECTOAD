package misrc;

public class Alumno {

    //1. VARIABLE DE INSTANCIA (ATRIBUTOS)

    private int codigoAlumno;
    private String nombre;
    private String apellido;
    private double estatura; 
    private int edad;

    //2. CONTRUCTORES 

    public Alumno() {}

    public Alumno(int ca, String nombre, String apellido, double estatura, int edad) {
         this.codigoAlumno = ca;
         this.nombre = nombre;
         this.apellido = apellido;
         this.estatura = estatura;
         this.edad = edad;
    }

    //3. METODOS GET Y SET

    public int getCodigoAlumno() {
        return codigoAlumno;
    }

    public void setCodigoAlumno(int codigoAlumno) {
        this.codigoAlumno = codigoAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
