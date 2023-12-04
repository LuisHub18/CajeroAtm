package Operaciones;

import Entidades.CajeroAutomatico;
import Entidades.Cuenta;
import Entidades.Transaccion;
import Util.Operaciones;
import Util.TipoTransaccion;

import java.time.LocalDate;

public class Consulta extends Operaciones {
    private final Cuenta cuenta;
    private CajeroAutomatico cajero;
    public Consulta(Cuenta cuenta, CajeroAutomatico cajero) {
        this.cuenta = cuenta;
        this.cajero = cajero;
    }
    @Override
    public Transaccion Transacciones(){
        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Se realizo una Operaciones.Consulta el" + LocalDate.now());
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("====================================");
        return new Transaccion(TipoTransaccion.CONSULTA, cuenta, this.cajero);
    }
}
