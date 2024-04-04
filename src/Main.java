import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        GestorAcademico gestorAcademico = new GestorAcademico();

        // ---------------------------------------------------------------- Objetos y Listas ----------------------------------------------------------------
        // Creacion de Estudiante
        Estudiante estudiante1 = new Estudiante("Josue", "Garcia", ZonedDateTime.of(1993, 12, 3, 10, 20, 59, 90000, ZoneId.systemDefault()), "E01", "Matriculado");
        Estudiante estudiante2 = new Estudiante("Julio", "Barreda", ZonedDateTime.of(1988, 3, 14, 19, 22, 32, 90000, ZoneId.systemDefault()), "E02", "Matriculado");

        // Matricular Estudiantes
        System.out.println("\n------------------ Estudiantes ------------------\r");
        System.out.println("---------- Agregar ----------\r");
        gestorAcademico.matricularEstudiante(estudiante1);
        gestorAcademico.matricularEstudiante(estudiante2);
        gestorAcademico.matricularEstudiante(estudiante1);

        // Impresion de Estudiantes Matriculados
        System.out.println("\n---------- Lista ----------\r");
        List<Estudiante> estudiantes = gestorAcademico.getEstudiantes();
        for (Estudiante estudiante : estudiantes) {
            System.out.println("ID; " + estudiante.getId() + ", Nombre: " + estudiante.getNombre() + ", Apellido: " + estudiante.getApellido() + ", Fecha de Nacimiento: " + estudiante.getFechaDeNacimientoF() + ", Estado: " + estudiante.getEstado());
        }

        // Creacion de Cursos
        Curso curso1 = new Curso("ELE01", "Electrónica Analógica", "Tensión, corriente", 25, "1.0");
        Curso curso2 = new Curso("PRO01", "Programación Básica", "Lenguajes de programación, logica programacional", 25, "1.1");

        // Agregar Cursos
        System.out.println("\n------------------ Cursos ------------------\r");
        System.out.println("---------- Agregar ----------\r");
        gestorAcademico.agregarCurso(curso1);
        gestorAcademico.agregarCurso(curso2);

        // Impresion de Cursos Agregados
        System.out.println("\n---------- Lista ----------\r");
        List<Curso> cursos = gestorAcademico.getCursos();
        for (Curso curso : cursos) {
            System.out.println("ID; " + curso.getId() + ", Nombre: " + curso.getNombre() + ", Descripción: " + curso.getDescripcion() + ", Número de Créditos: " + curso.getNumeroCreditos() + ", Versión: " + curso.getVersion());
        }


        // ---------------------------------------------------------------- HashMap ----------------------------------------------------------------
        // Asignacion de Cursos
        System.out.println("\nAsignación de Estudiantes a Cursos\r");
        gestorAcademico.inscribirEstudianteCurso(estudiante1, "PRO01");
        gestorAcademico.inscribirEstudianteCurso(estudiante2, "PRO01");

        gestorAcademico.inscribirEstudianteCurso(estudiante1, "ELE01");
        gestorAcademico.inscribirEstudianteCurso(estudiante2, "ELE01");

        // Impresion de Estudiantes Inscritos
        System.out.println("\nEstudiantes Inscristos a los Curos \r");
        gestorAcademico.getEstudiantesInscritosCurso();

        // Agregar Nuevo Curso
        Estudiante estudiante3 = new Estudiante("Cristobal", "Lara", ZonedDateTime.of(1988, 3, 14, 19, 22, 32, 90000, ZoneId.systemDefault()), "E03", "Matriculado");

        // Asignacion del nuevo estudiante al Curso
        gestorAcademico.inscribirEstudianteCurso(estudiante3, "PRO01");

        // Impresion actualizada de Estudiantes Inscritos
        System.out.println("\nEstudiantes Inscristos a los Curos - Actualizado \r");
        gestorAcademico.getEstudiantesInscritosCurso();

        // Desenscribir estudiante del Curso
        gestorAcademico.desinscribirEstudianteCurso("E02", "PRO01");
        gestorAcademico.desinscribirEstudianteCurso("E020", "PRO01");
        gestorAcademico.desinscribirEstudianteCurso("E02", "PR01");

        // Impresion actualizada de Estudiantes Inscritos
        System.out.println("\nEstudiantes Inscristos a los Curos - Actualizado \r");
        gestorAcademico.getEstudiantesInscritosCurso();


    }
}
