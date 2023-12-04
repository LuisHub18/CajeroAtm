package entidades;

import util.TipoTransaccion;
import java.time.LocalDate;
import java.util.UUID;

public class Transaccion{
    UUID id;
    LocalDate fecha;
    TipoTransaccion tipo;
    double monto;

    Cuenta cuenta;
    CajeroAutomatico cajero;

    Cuenta cuentaDestino;
    //Retiro o Deposito
    public Transaccion(TipoTransaccion tipo, double monto, Cuenta cuenta, CajeroAutomatico cajero) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDate.now();
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
        this.cuentaDestino = null;
        this.cajero = cajero;
    }
    //Consulta
    public Transaccion (TipoTransaccion tipo, Cuenta cuenta, CajeroAutomatico cajero) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDate.now();
        this.tipo = tipo;
        this.monto = 0;
        this.cuenta = cuenta;
        this.cuentaDestino = null;
        this.cajero = cajero;
    }
    //Transferencia
    public Transaccion(TipoTransaccion tipo, double monto, Cuenta cuenta, Cuenta cuentaDestino, CajeroAutomatico cajero) {
        this.id = UUID.randomUUID();
        this.fecha = LocalDate.now();
        this.tipo = tipo;
        this.monto = monto;
        this.cuenta = cuenta;
        this.cuentaDestino = cuentaDestino;
        this.cajero = cajero;
    }
    public String imprimirTicket(){
        return "====================================\n" +
                "================="+cajero.getBanco()+"===============\n" +
                "				"+ tipo.name() +"				\n" +
                "Fecha: " + fecha + "\n" +
                "Cliente: " + cuenta.getCliente() +"\n" +
                "Monto: " + monto + "\n" +
                "Saldo: " + cuenta.getSaldo() + "\n" +
                "====================================\n";
    }
}
