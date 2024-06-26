package entidades;

import java.util.ArrayList;
import java.util.UUID;

public class Banco {
    private UUID id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String rfc;

    private ArrayList<CajeroAutomatico> cajeros = new ArrayList<CajeroAutomatico>();

    public Banco(String nombre, String direccion, String telefono, String rfc) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    public void agregarCajero(CajeroAutomatico cajero) {
        this.cajeros.add(cajero);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getRfc() {
        return this.rfc;
    }
}
