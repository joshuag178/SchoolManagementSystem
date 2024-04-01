import java.util.Date;

public class Estudiante {
    private String id;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String estado;

    public Estudiante(String id, String nombre, String apellido, Date fechaDeNacimiento, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "ID = '" + id + '\'' +
                ", Nombre = '" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", Fecha De Nacimiento=" + fechaDeNacimiento +
                ", Estado='" + estado + '\'' +
                '}';
    }
}
