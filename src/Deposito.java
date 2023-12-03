import Entidades.Cuenta;
import Entidades.Transaccion;
import Util.TipoTransaccion;

public class Deposito extends Clase_Abstractaa{
    private Cuenta cuenta;
    public Deposito(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public void hacerDeposito(double monto, Cuenta cuenta){
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas depositar: ");
        Deposito();
        hacerDeposito(deposito, this.cuenta);
        System.out.println("===================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("===================================");
    }
    
}