package entidades;

import java.util.UUID;

public class Cliente {
    public UUID id;
    private String nombre;
    private String direccion;
    private String num_cuenta;

    public Cliente( String nombre, String direccion,  String num_cuenta) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.direccion = direccion;
        this.num_cuenta = num_cuenta;
    }

    public String getNombre() {
        return this.nombre;
    }
}
