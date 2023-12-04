package operaciones;

import entidades.CajeroAutomatico;
import entidades.Cuenta;
import entidades.Transaccion;
import administradores.AdministraCuentas;
import util.Operaciones;
import util.TipoTransaccion;

import java.time.LocalDate;

public class Transferencia extends Operaciones {

    private AdministraCuentas cuentas = new AdministraCuentas();
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;

    private CajeroAutomatico cajero;

    public Transferencia(Cuenta cuentaOrigen, String destino, CajeroAutomatico cajero) {
        this.cuentaOrigen = cuentaOrigen;
        this.cajero = cajero;
        cuentaDestino = cuentas.buscarCuenta(destino);
    }
    @Override
    public Transaccion Transacciones() {
    			System.out.print("Cuanto quieres Transferir: ");
                int transferencia = Transferencia();
                if (transferencia <= cuentaOrigen.getSaldo()) {
                    cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - transferencia);
                    cuentaDestino.setSaldo(cuentaDestino.getSaldo() + transferencia);

                    System.out.println("====================================");
                    System.out.println("=================BBVA===============");
                    System.out.println("				Debito				");
                    System.out.println("Se realizo una transferencia el " + LocalDate.now());
                    System.out.println("A la cuenta "+ cuentas.numCuenta(cuentaOrigen.getCliente()));
                    System.out.println("transferiste : " + transferencia);
                    System.out.println("Tu saldo actual es: " + cuentaOrigen.getSaldo());
                    System.out.println("====================================");
                } else {
                    System.out.println("=====================");
                    System.out.println("Saldo insuficiente");
                    System.out.println("=====================");
               
        	
                }
            return new Transaccion(TipoTransaccion.TRANSFERENCIA, transferencia, cuentaOrigen, cuentaDestino, this.cajero);
    }
}