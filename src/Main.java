import Entidades.Banco;
import Entidades.CajeroAutomatico;
import Entidades.Cliente;
import Administradores.AdministraCuentas;
import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Banco banco = new Banco("BBVA", "Calle 1", "123456789", "123456789");
        CajeroAutomatico cajero = new CajeroAutomatico(banco.getNombre());
        banco.agregarCajero(cajero);
        Cliente cliente1 = new Cliente("Catalina", "Calle 1", "23140972");
        Cliente cliente2 = new Cliente("Juan", "Calle 2", "23140973");
        AdministraCuentas cuenta = new AdministraCuentas();
        cuenta.agregarCuenta("23140972", cliente1.id, 8002, 1700, banco);
        cuenta.agregarCuenta("23140973", cliente2.id, 8003, 1000, banco);
        System.out.println("----------------------------------------------------");
        System.out.println("Ingrese su Numero de cuenta:");
        String Num_cuenta = entrada.nextLine();
        System.out.println("Ingrese su Nip:		(8002)");
        int Nip = entrada.nextInt();
        System.out.println("----------------------------------------------------");

        if(cuenta.validarCuenta(Num_cuenta,Nip)){
            cajero.Operaciones(cuenta.buscarCuenta(Num_cuenta));
        }else{
            System.out.println("=================\n\tNo se pudo ingresar\n===============");
        }
    }
}

