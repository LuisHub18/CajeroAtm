package Util;

import Entidades.Transaccion;

import java.util.Scanner;
public abstract class Operaciones {
    protected int retiro, deposito,transferencia;
    Scanner entrada = new Scanner(System.in);

	public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    public int Transferencia(){
        return transferencia = entrada.nextInt();
    }
    public abstract Transaccion Transacciones();
}