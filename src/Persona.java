import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private String apellido;
    private ZonedDateTime fechaDeNacimiento;

    public Persona(String nombre, String apellido, ZonedDateTime fechaDeNacimiento) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
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

    public ZonedDateTime getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    // Metodo que devuelve un string con la fecha formateada Dia, Mes, Año
    public String getFechaDeNacimientoF() {
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return sdf.format(fechaDeNacimiento);
    }

    public void setFechaDeNacimiento(ZonedDateTime fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

}
