package Entidades;

import java.util.UUID;
import java.util.HashMap;
import java.util.Map;

public class Cuenta {
    private int nip;
    private UUID cliente;
    private double saldo;

    public Map<String, Cuenta> Cuentas = new HashMap<>();

    public Cuenta(UUID cliente, int nip, double saldo) {
        this.cliente = cliente;
        this.nip = nip;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public void agregarCuenta(String num_cuenta, UUID cliente, int nip, double saldo){
        Cuentas.put(num_cuenta, new Cuenta(cliente,nip,saldo));
    }
    public boolean validarCuenta(String cuenta, int nip){
        if (Cuentas.containsKey(cuenta) && obtenerNip(nip))
            return true;
        return false;
    }

    public String numCuenta (){
        for (Map.Entry<String, Cuenta> entry : Cuentas.entrySet()) {
            String key = entry.getKey();
            return key;
        }
        return "";
    }

    public boolean obtenerNip(int nip) {
        for (Map.Entry<String, Cuenta> entry : Cuentas.entrySet()) {
            Cuenta cuenta = entry.getValue();
            if (cuenta.getNip() == nip)
                 return true;
        }

        return false;
    }


    public Cuenta buscarCuenta(String cuenta){
            return Cuentas.get(cuenta);
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
