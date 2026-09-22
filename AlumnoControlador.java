package institutoinnova.t1;

import java.util.ArrayList;

public class AlumnoControlador {

    ArrayList<Alumno> lista_alumnos = new ArrayList();

  
    void agregarAlumno(Alumno a) {
        lista_alumnos.add(a);
    }


    void listarAlumnos() {
        System.out.println("La lista de alumnos es:");

        for (Alumno alumno : lista_alumnos) {
            alumno.verAlumno();
        }
    }
}