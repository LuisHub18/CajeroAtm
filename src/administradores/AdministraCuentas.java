package administradores;

import entidades.Banco;
import entidades.Cuenta;
import util.TipoCuenta;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AdministraCuentas {
    public static Map<String, Cuenta> Cuentas = new HashMap<>();
    public void agregarCuenta(String num_cuenta, UUID cliente, int nip, double saldo, Banco banco){
        Cuentas.put(num_cuenta, new Cuenta(cliente,nip,saldo, TipoCuenta.AHORRO, banco));
    }
    public boolean validarCuenta(String cuenta, int nip){
        return Cuentas.containsKey(cuenta) && obtenerNip(nip);
    }

    public String numCuenta(UUID clienteId) {
        for (Map.Entry<String, Cuenta> entry : Cuentas.entrySet()) {
            Cuenta cuenta = entry.getValue();
            if (cuenta.getCliente().toString().equals(clienteId.toString())) {
                return entry.getKey();
            }
        }
        return "";
    }

    public boolean obtenerNip(int nip) {
        return Cuentas.values().stream().anyMatch(cuenta -> cuenta.getNip() == nip);
    }

    public Cuenta buscarCuenta(String cuenta){
        return Cuentas.get(cuenta);
    }
}
