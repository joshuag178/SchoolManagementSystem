import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Objects;

public class Estudiante extends Persona{
    private String id;
    private String estado;

    public Estudiante(String nombre, String apellido, ZonedDateTime fechaDeNacimiento, String id, String estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Sobreescritura del metodo toString para ser utilizado en la impresion de la informacion del HashMap.
    @Override
    public String toString() {
        return "Estudiante {" +
                "ID : " + id  +
                ", Nombre : " + getNombre() +
                ", Apellido : " + getApellido() +
                ", Fecha de Nacimiento : " + getFechaDeNacimientoF() +
                ", Estado : " + estado +
                '}';
    }

    // Sobreescritura del metodo equals(utilizado por contains) para poder verificar si existe un estudiante en base al ID.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
