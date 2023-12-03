import Entidades.Cuenta;

import java.time.LocalDate;

public class Transferencia extends Clase_Abstractaa {

    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;

    public Transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino) {
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }
    @Override
    public void Transacciones() {
    			System.out.print("Cuanto quieres Transferir: ");
                Transferencia();
                if (transferencia <= cuentaOrigen.getSaldo()) {
                    cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - transferencia);
                    cuentaDestino.setSaldo(cuentaDestino.getSaldo() + transferencia);

                    System.out.println("====================================");
                    System.out.println("=================BBVA===============");
                    System.out.println("				Debito				");
                    System.out.println("Se realizo una transferencia el " + LocalDate.now());
                    System.out.println("A la cuenta "+ cuentaOrigen.getNumCuenta());
                    System.out.println("transferiste : " + transferencia);
                    System.out.println("Tu saldo actual es: " + cuentaOrigen.getSaldo());
                    System.out.println("====================================");
                } else {
                    System.out.println("=====================");
                    System.out.println("Saldo insuficiente");
                    System.out.println("=====================");
               
        	
                }
    			
    }
}