package Entidades;

import Operaciones.Consulta;
import Operaciones.Deposito;
import Operaciones.Retiro;
import Operaciones.Transferencia;
import Administradores.AdministraTransacciones;
import Util.Operaciones;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class CajeroAutomatico {

    private Locale localizacion;
    private String banco;
    private AdministraTransacciones transacciones = new AdministraTransacciones();

    static Scanner entrada = new Scanner(System.in);

    public CajeroAutomatico(String banco){
        localizacion = Locale.getDefault();
        this.banco = banco;
    }

    public String getBanco() {
        return banco;
    }

    private void deseaImprimirTicket(Transaccion transaccion) {
        System.out.println("¿Desea imprimir el ticket de la transacción?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int seleccion = entrada.nextInt();
        if(seleccion == 1){
            System.out.println(transaccion.imprimirTicket());
        }
    }

    public void Operaciones(Cuenta cuentaOrigen) {
        int bandera = 0;
        int seleccion;
        do {
            do {
                System.out.println(" Bienvenido, está en un cajero automatico de BBVA");
                System.out.println(" Hoy es " + LocalDate.now());
                System.out.println(" Porfavor seleccione una operaciones:");
                System.out.println("    1. Consulta de saldo.");
                System.out.println("    2. Retiro de efectivo.");
                System.out.println("    3. Deposito de efectivo.");
                System.out.println("    4. Hacer una transferencia");
                System.out.println("    5. Salir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 5) {
                    bandera = 1;
                } else {
                    System.out.println("=================================================");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("=================================================");
                }
            } while (bandera == 0);

            if(seleccion == 1){
                Operaciones mensajero = new Consulta(cuentaOrigen, this);
                Transaccion transaccion = mensajero.Transacciones();
                transacciones.agregarTransaccion(transaccion);
                deseaImprimirTicket(transaccion);
            }else if(seleccion == 2){
                Operaciones mensajero = new Retiro(cuentaOrigen, this);
                Transaccion transaccion = mensajero.Transacciones();
                transacciones.agregarTransaccion(transaccion);
                deseaImprimirTicket(transaccion);
            } else if(seleccion == 3){
                Operaciones mensajero = new Deposito(cuentaOrigen, this);
                Transaccion transaccion = mensajero.Transacciones();
                transacciones.agregarTransaccion(transaccion);
                deseaImprimirTicket(transaccion);
            } else if(seleccion == 4){
                System.out.println("------Operaciones.Transferencia--------\nCuenta destino: ");
                String destino = entrada.next();
                Operaciones mensajero = new Transferencia(cuentaOrigen, destino, this);
                Transaccion transaccion = mensajero.Transacciones();
                transacciones.agregarTransaccion(transaccion);
                deseaImprimirTicket(transaccion);
            } else if(seleccion == 5){
                System.out.println("==========================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("==========================");
                bandera = 2;
            }
        } while (bandera != 2);
    }
}
