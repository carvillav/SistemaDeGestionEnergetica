package usuario;

import java.time.LocalDateTime;

public abstract class Usuario {
    protected String Nombre;
    protected String apellido;
    protected String domicilio;
    protected String usuario;
    protected String contrasenia;
    protected LocalDateTime fechaAlta;

    // SETTERS Y GETTERS
    public String getNombre() { return Nombre; }

    public void setNombre(String nombre) { Nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDomicilio() { return domicilio; }

    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getContrasenia() { return contrasenia; }

    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public LocalDateTime getFechaAlta() { return fechaAlta; }

    public void setFechaAlta(LocalDateTime fechaAlta) { this.fechaAlta = fechaAlta; }

}
