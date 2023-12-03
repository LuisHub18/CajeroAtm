import Entidades.Cuenta;
import Entidades.Transaccion;
import Util.TipoTransaccion;

import java.time.LocalDate;

public class Retiro extends Clase_Abstractaa {
	private Cuenta cuenta;

	public Retiro(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
    @Override
    public void Transacciones() {
    	
    			 System.out.print("Cuanto deseas retirar: ");
    		        Retiro();
    		        if (retiro <= cuenta.getSaldo()) {
    		            cuenta.setSaldo(cuenta.getSaldo() - retiro);
    		            System.out.println("====================================");
    		            System.out.println("=================BBVA===============");
    		            System.out.println("				Debito				");
    		            System.out.println("Se realizo una Consulta" + LocalDate.now());
    		            System.out.println("Retiraste : " + retiro);
    		            System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
    		            System.out.println("====================================");
    		        } else {
    		            System.out.println("=====================");
    		            System.out.println("Saldo insuficiente.");
    		            System.out.println("=====================");
    
       
    }
}
}
