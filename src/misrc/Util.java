package misrc;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<Alumno> datos() {
        List<Alumno> alumnos_al = new ArrayList<Alumno>();

        for (int i = 0; i < Datos.codigoAlumno.length; i++) {
            Alumno alumno = new Alumno();
            int ca = Datos.codigoAlumno[i];
            String nombre = Datos.nombre[i];
            String apellido = Datos.apellido[i];
            double estatura = Datos.estatura[i];
            int edad = Datos.edad[i];

            alumno.setCodigoAlumno(ca);
            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.setEstatura(estatura);
            alumno.setEdad(edad);

            alumnos_al.add(alumno);
        }

        return alumnos_al;

    }

    public List<Alumno> datos1() {
        List<Alumno> alumnos_al1 = new ArrayList<Alumno>();

        Alumno alumno1 = new Alumno();
        int ca = Datos.codigoAlumno[0];
        String nombre = Datos.nombre[0];
        String apellido = Datos.apellido[0];
        double estatura = Datos.estatura[0];
        int edad = Datos.edad[0];

        alumnos_al1.add(alumno1);

        Alumno alumno2 = new Alumno();

        int ca1 = Datos.codigoAlumno[1];
        String nombre1 = Datos.nombre[1];
        String apellido1 = Datos.apellido[1];
        double estatura1 = Datos.estatura[1];
        int edad1 = Datos.edad[1];
        alumnos_al1.add(alumno2);

        return alumnos_al1;

    }

    public static void mostrar(List<Alumno> alumnos_al) {
        Alumno alumno;
        for (int i = 0; i < alumnos_al.size(); i++) {
            alumno = alumnos_al.get(i);
            System.out.println("Codigo alumno = " + alumno.getCodigoAlumno());
            System.out.println("Nombre = " + alumno.getNombre());
            System.out.println("Apellido = " + alumno.getApellido());
            System.out.println("Estatura = " + alumno.getEstatura());
            System.out.println("Edad = " + alumno.getEdad());

        }
    }

    public static void buscar(int ca, List<Alumno> alumnos_al) {
        try {
            Alumno alumno = alumnos_al.get(ca - 1);
            System.out.println("Codigo Alumno = " + alumno.getCodigoAlumno());
            System.out.println("Nombre = " + alumno.getNombre());
        } catch (Exception e) {
            System.out.println("Alumno no existe");
        }

    }

}

/*
    public static void buscar(int ca, List<Alumno> alumnos_al) {
        Alumno alumno = alumnos_al.get(ca-1);
        System.out.println("Codigo Alumno = " + alumno.getCodigoAlumno());
        System.out.println("Nombre = " + alumno.getNombre());
        System.out.println("Apellido = " + alumno.getApellido());
    }

    public static void eliminar1(int ca, List<Alumno> alumnos_al) {
        alumnos_al.remove(ca - 1);
    }

    public static void eliminar2(int ca, List<Alumno> alumnos_al) {
        try {
        alumnos_al.remove(ca - 1);
        }catch (Exception e) {
            System.out.println("Alumno no encontrado");
        }
    }
 */
