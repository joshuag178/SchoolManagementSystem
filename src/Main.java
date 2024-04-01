import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorAcademico gestorAcademico = new GestorAcademico();

        gestorAcademico.agregarEstudiante(new Estudiante("E01", "Josue", "Garcia", new Date(), "Activo"));
        gestorAcademico.agregarEstudiante(new Estudiante("E02", "Julio", "Barreda", new Date(), "Activo"));

        List<Estudiante> estudiantes = gestorAcademico.getEstudiantes();

        System.out.println("Estudiantes \r");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("ID; " + estudiante.getId() + ", Nombre: " + estudiante.getNombre() + ", Apellido: " + estudiante.getApellido() + ", Fecha de Nacimiento: " + estudiante.getFechaDeNacimiento() + ", Estado: " + estudiante.getEstado());
        }

        gestorAcademico.agregarCurso(new Curso("ELE01", "Electrónica Analógica", "Tensión, corriente", 25, 1));
        gestorAcademico.agregarCurso(new Curso("PRO01", "Programación 1", "Lenguajes de programación, logica programacional", 25, 1));

        List<Curso> cursos = gestorAcademico.getCursos();

        System.out.println("\nCursos \r");
        for (Curso curso : cursos) {
            System.out.println("ID; " + curso.getId() + ", Nombre: " + curso.getNombre() + ", Descripción: " + curso.getDescripcion() + ", Número de Créditos: " + curso.getNumeroCreditos() + ", Versión: " + curso.getVersion());
        }

        gestorAcademico.estudianteInscritos("ELE01", estudiantes);
        gestorAcademico.estudianteInscritos("PRO01", estudiantes);

        System.out.println("\nEstudiantes Incristos a los Curos \r");
        gestorAcademico.getEstudiantesInscritos();

    }
}
