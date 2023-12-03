package Entidades;

import java.util.UUID;

public class Cuenta {
    private String num_cuenta;
    private int nip;
    private UUID cliente;
    private double saldo;

    public Cuenta(String num_cuenta, UUID cliente, int nip, double saldo) {
        this.num_cuenta = num_cuenta;
        this.cliente = cliente;
        this.nip = nip;
        this.saldo = saldo;
    }

    public int getNip() {
        return this.nip;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getNumCuenta() {
        return this.num_cuenta;
    }
}
