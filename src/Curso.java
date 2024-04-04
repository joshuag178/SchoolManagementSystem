import java.util.Objects;

public class Curso {
    private String id;
    private String nombre;
    private String descripcion;
    private int numeroCreditos;
    private String version;

    public Curso(String id, String nombre, String descripcion, int numeroCreditos, String version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    // Sobreescritura del metodo toString para ser utilizado en la impresion de la informacion.
    @Override
    public String toString() {
        return "Curso{" +
                "ID = '" + id + '\'' +
                ", Nombre = '" + nombre + '\'' +
                ", Descripción = '" + descripcion + '\'' +
                ", Número de Créditos = " + numeroCreditos +
                ", Versión = " + version +
                '}';
    }

    // Sobreescritura del metodo equals(utilizado por contains) para poder verificar si existe un curso en base al ID.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
