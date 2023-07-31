package dispositivo;

import usuario.Cliente;

public abstract class Dispositivo {

    protected Caracteristicas caracteristicas;
    protected Cliente cliente;

    // SETTERS Y GETTERS

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Caracteristicas getCaracteristicas() { return caracteristicas; }

    public void setCaracteristicas(Caracteristicas caracteristicas) { this.caracteristicas = caracteristicas; }
}
