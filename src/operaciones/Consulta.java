package operaciones;

import entidades.CajeroAutomatico;
import entidades.Cuenta;
import entidades.Transaccion;
import util.Operaciones;
import util.TipoTransaccion;

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
        System.out.println("==============================================");
        System.out.println("===================== BBVA ===================");
        System.out.println("				    Consulta				  ");
        System.out.println("Se realizo un consulta el" + LocalDate.now());
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("==============================================");
        return new Transaccion(TipoTransaccion.CONSULTA, cuenta, this.cajero);
    }
}
