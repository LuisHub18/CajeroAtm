package operaciones;

import entidades.CajeroAutomatico;
import entidades.Cuenta;
import entidades.Transaccion;
import util.Operaciones;
import util.TipoTransaccion;

public class Deposito extends Operaciones {
    private Cuenta cuenta;
    private CajeroAutomatico cajero;
    public Deposito(Cuenta cuenta, CajeroAutomatico cajero) {
        this.cuenta = cuenta;
        this.cajero = cajero;
    }
    public void hacerDeposito(double monto, Cuenta cuenta){
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }
    @Override
    public Transaccion Transacciones(){
        System.out.print("Cuanto deseas depositar: ");
        Deposito();
        hacerDeposito(deposito, this.cuenta);
        System.out.println("==============================================");
        System.out.println("===================== BBVA ===================");
        System.out.println("				     Debito		  		      ");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("==============================================");
        return new Transaccion(TipoTransaccion.DEPOSITO,deposito,cuenta, this.cajero);
    }
    
}