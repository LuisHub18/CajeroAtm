import Entidades.Cliente;
import Entidades.Cuenta;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
//All well
public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void Operaciones(Cuenta cuentaOrigen) {
        int bandera = 0;
        int seleccion = 0;
        String Nombre = "";
        do {
            do {
                System.out.println(" Bienvenido, está en un cajero automatico de BBVA");
                System.out.println(" Hoy es " + LocalDate.now());
                System.out.println(" Porfavor seleccione una opción:");
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
                Clase_Abstractaa mensajero = new Consulta(cuentaOrigen);
                mensajero.Transacciones();
            }else if(seleccion == 2){
                Clase_Abstractaa mensajero = new Retiro(cuentaOrigen);
                mensajero.Transacciones();
            } else if(seleccion == 3){
                Clase_Abstractaa mensajero = new Deposito(cuentaOrigen);
                mensajero.Transacciones();
            } else if(seleccion == 4){
                System.out.println("------Transferencia--------\nCuenta destino: ");
                String destino = entrada.next();
                Clase_Abstractaa mensajero = new Transferencia(cuentaOrigen, destino);
                mensajero.Transacciones();
            } else if(seleccion == 5){
                System.out.println("==========================");
                System.out.println("Gracias, vuelva pronto.");
                System.out.println("==========================");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    public static void main(String[] args) {

        //Aqui crearemos clientes y la cuenta de cada uno
        Cliente cliente1 = new Cliente("Catalina", "Calle 1", "23140972");
        Cliente cliente2 = new Cliente("Juan", "Calle 2", "23140973");
        Cuenta cuenta = new Cuenta();
        cuenta.agregarCuenta("23140972", cliente1.id, 8002, 1700);
        cuenta.agregarCuenta("23140973", cliente2.id, 8003, 1000);

        /*System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Nombre:");
        String Nombre = entrada.nextLine(); */
        System.out.println("Ingrese su Numero de cuenta:");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:		(8002)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");

        if(cuenta.validarCuenta(Num_cuenta,Nip)){
            Operaciones(cuenta.buscarCuenta(Num_cuenta));
        }else{
            System.out.println("=================\n\tNo se pudo ingresar\n===============");
        }

       /* boolean cuentaEncontrada = Arrays.stream(cuentas)
                .anyMatch(cuenta -> cuenta.getNumCuenta().equals(Num_cuenta) &&
                        cuenta.getNip() == Nip &&
                        cuenta.getClienteId().equals(nombre));*/


        /*if(Nombre.equals("Catalina") && Num_cuenta.equals("23140972") && Nip==8002) {
        	System.out.println("===============================================");
        	System.out.print(Nombre);
            Clase_Abstractaa mesajero = new Consulta();
            mesajero.setSaldo(1700);
            mesajero.Operaciones();
        }else {
        	System.out.println("===============================================");
            System.out.println("Alguno de sus datos es erroneo, intente denuevo");
        	System.out.println("===============================================");

        }*/
    }
}

