package entidades;

import util.TipoCuenta;
import java.util.UUID;

public class Cuenta {
    private UUID id;
    private final int nip;
    private final UUID cliente;
    private double saldo;
    private final TipoCuenta tipo;

    private Banco banco;

    public Cuenta(UUID cliente, int nip, double saldo, TipoCuenta tipo, Banco banco) {
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.nip = nip;
        this.saldo = saldo;
        this.tipo = tipo;
        this.banco = banco;
    }

    public UUID getCliente() {
        return this.cliente;
    }

    public TipoCuenta getTipo() {
        return this.tipo;
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
}
