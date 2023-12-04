package Administradores;

import Entidades.Transaccion;

import java.util.ArrayList;

public class AdministraTransacciones {
    ArrayList<Transaccion> transacciones = new ArrayList<Transaccion>();

    public void agregarTransaccion(Transaccion transaccion) {
        this.transacciones.add(transaccion);
    }

    public ArrayList<Transaccion> getTransacciones() {
        return this.transacciones;
    }
}
