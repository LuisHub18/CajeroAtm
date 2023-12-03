import java.time.LocalDate;
import java.util.Scanner;
public abstract class Clase_Abstractaa {
    protected int retiro, deposito,transferencia;
    Scanner entrada = new Scanner(System.in);

	public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    public void Transferencia(){
        transferencia = entrada.nextInt();
    }
    public abstract void Transacciones();
}
