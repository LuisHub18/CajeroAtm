import Entidades.Cuenta;

import java.time.LocalDate;

public class Consulta extends Clase_Abstractaa{
    private Cuenta cuenta;
    public Consulta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    @Override
    public void Transacciones(){
        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Se realizo una Consulta el" + LocalDate.now());
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("====================================");
    }    
}
