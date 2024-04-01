import java.util.*;

public class GestorAcademico {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;

    private Map<String, List<Estudiante>> estudiantesInscritos = new HashMap<String, List<Estudiante>>();

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
//        this.estudiantesInscritos = new HashMap<String, List<Estudiante>>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public List<Estudiante> getEstudiantes(){
        return Collections.unmodifiableList(estudiantes);
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }

    public List<Curso> getCursos(){
        return Collections.unmodifiableList(cursos);
    }

    public void estudianteInscritos(String cod_curso, List<Estudiante> estudiante){
        estudiantesInscritos.put(cod_curso, estudiante);
    }

    public void getEstudiantesInscritos(){
        int contador = 0;
        for (String i : estudiantesInscritos.keySet()){
            System.out.println("Codigo Curso: " + i + " - Estudiantes: " + estudiantesInscritos.get(i).toString() + "\r");
            contador = contador + 1;
        }
    }
}
