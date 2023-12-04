package Operaciones;

import Entidades.CajeroAutomatico;
import Entidades.Cuenta;
import Entidades.Transaccion;
import Util.Operaciones;
import Util.TipoTransaccion;

import java.time.LocalDate;

public class Retiro extends Operaciones {
	private Cuenta cuenta;
	private CajeroAutomatico cajero;
	public Retiro(Cuenta cuenta, CajeroAutomatico cajero) {
		this.cuenta = cuenta;
		this.cajero = cajero;
	}
    @Override
    public Transaccion Transacciones() {
    			 System.out.print("Cuanto deseas retirar: ");
    		        Retiro();
    		        if (retiro <= cuenta.getSaldo()) {
    		            cuenta.setSaldo(cuenta.getSaldo() - retiro);
    		            System.out.println("====================================");
    		            System.out.println("=================BBVA===============");
    		            System.out.println("				Debito				");
    		            System.out.println("Se realizo una Operaciones.Consulta" + LocalDate.now());
    		            System.out.println("Retiraste : " + retiro);
    		            System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
    		            System.out.println("====================================");
    		        } else {
    		            System.out.println("=====================");
    		            System.out.println("Saldo insuficiente.");
    		            System.out.println("=====================");
    		}
		return new Transaccion(TipoTransaccion.RETIRO,deposito,cuenta, this.cajero);
	}
}
