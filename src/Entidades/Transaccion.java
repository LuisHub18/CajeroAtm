package Entidades;

import Util.TipoTransaccion;
import java.time.LocalDate;
import java.util.UUID;

public class Transaccion{
    UUID id;
    LocalDate fecha;
    TipoTransaccion tipo;
    double monto;

    Cuenta cuenta;


    public Transaccion(TipoTransaccion tipo, double monto, Cuenta cuenta) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDate.now();
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
    }


    public double getMonto() {
        return this.monto;
    }

    public TipoTransaccion getTipo() {
        return this.tipo;
    }

    public Cuenta getNumCuentaOrigen() {
        return this.cuenta;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
