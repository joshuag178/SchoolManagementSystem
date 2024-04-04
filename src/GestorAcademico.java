import java.util.*;

public class GestorAcademico implements ServiciosAcademicosI {
    private final List<Estudiante> estudiantes;
    private final List<Curso> cursos;

    private final Map<String, List<Estudiante>> estudiantesInscritosCurso;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.estudiantesInscritosCurso = new HashMap<>();
    }

    //Metodo que devuelve la Lista de Estudiantes
    public List<Estudiante> getEstudiantes() {
        return Collections.unmodifiableList(estudiantes);
    }

    //Metodo que devuelve la Lista de Cursos
    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    //Metodo que imprime los datos del HashMap
    public void getEstudiantesInscritosCurso() {
        for (String i : estudiantesInscritosCurso.keySet()) {
            System.out.println("Codigo Curso: " + i + " - Estudiantes: " + estudiantesInscritosCurso.get(i).toString() + "\r");
        }
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        boolean existeEstudiante = estudiantes.contains(estudiante);
        if (existeEstudiante) {
            System.out.println("Error: El Estudiante que esta intentando agrear a la lista, ya existe.");
        } else {
            estudiantes.add(estudiante);
            System.out.println("Confirmación: Se agrego el estudiante correctamente");
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        boolean existeCurso = cursos.contains(curso);
        if (existeCurso) {
            System.out.println("Error: El Curso que esta intentando agrear a la lista, ya existe.\n");
        } else {
            cursos.add(curso);
            System.out.println("Confirmación: Se agrego el curso correctamente");
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, String idCurso) {
        try {
            procesoInscribirEstudianteCurso(estudiante, idCurso);
        } catch (EstudianteYaInscritoException e) {
            System.out.println(e.getMessage());
        }
    }

    private void procesoInscribirEstudianteCurso(Estudiante estudiante, String idCurso) throws EstudianteYaInscritoException{
            try {
                List<Estudiante> estudiantesinscritos = new ArrayList<>(estudiantesInscritosCurso.get(idCurso));
                if (estudiantesinscritos.contains(estudiante)) {
                    throw new EstudianteYaInscritoException("El estudiante ya tiene asignado el curso");
                } else {
                    estudiantesinscritos.add(estudiante);
                    estudiantesInscritosCurso.put(idCurso, estudiantesinscritos);
                    System.out.println("Se asigna el curso: " + idCurso + " al estudiante: "+ estudiante.getId() + " - " + estudiante.getNombre() + " " + estudiante.getApellido());
                }
            }catch (Exception e){
                List<Estudiante> estudiantesinscritos = new ArrayList<>();
                estudiantesinscritos.add(estudiante);
                estudiantesInscritosCurso.put(idCurso, estudiantesinscritos);
                System.out.println("Se asigna el curso: " + idCurso + " al estudiante: "+ estudiante.getId() + " - " + estudiante.getNombre() + " " + estudiante.getApellido());
            }
  }

    @Override
    public void desinscribirEstudianteCurso(String idEstudiante, String idCurso) {
        try {
            procesoDesinscribirEstudianteCurso(idEstudiante, idCurso);
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());
        }
    }

    private void procesoDesinscribirEstudianteCurso(String idEstudiante, String idCurso) throws EstudianteNoInscritoEnCursoException {
        if (estudiantesInscritosCurso.containsKey(idCurso)) {
            List<Estudiante> estudiantesinscritos = new ArrayList<>(estudiantesInscritosCurso.get(idCurso));
            boolean existe = false;
            for (Estudiante estudiante : estudiantesinscritos) {
                if (estudiante.getId().equals(idEstudiante)) {
                    existe = true;
                    estudiantesinscritos.remove(estudiante);
                    estudiantesInscritosCurso.put(idCurso, estudiantesinscritos);
                    System.out.println("Se ha eliminado al estudiante: " + idEstudiante + " del curso: " + idCurso);
                    break;
                }
            }
            if (!existe) {
                throw new EstudianteNoInscritoEnCursoException("El estudiante no esta inscrito en el curso");
            }
        } else {
            throw new EstudianteNoInscritoEnCursoException("El ID del curso no es valido");
        }
    }
}
