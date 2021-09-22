package misrc;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // DATOS PARA TODO EL PROYECTO UNA SOLA VEZ
        List<Alumno> alumnos_al = Util.datos();

        System.out.println("MOSTRAR");
        System.out.println("=======");
        {
            Util.mostrar(alumnos_al);
        }

        System.out.println("BUSCAR");
        System.out.println("======");
        {
            Util.buscar(6, alumnos_al);
        }



    }

}

/*
        System.out.println("BUSCAR");
        System.out.println("======");
        {
            Util.buscar(2, alumnos_al);
        }

        System.out.println("ELIMINAR");
        System.out.println("========");
        {
            Util.eliminar2(5, alumnos_al);
            Util.mostrar(alumnos_al);
        }*/
