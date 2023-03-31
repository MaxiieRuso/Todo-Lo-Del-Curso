
package Ejercicio11;

import java.util.Scanner;

public class Banco {
    private int numCuenta;
    private String titular;
    private double saldo;

    public Banco(int numCuenta, String titular, double saldo, int[] cant) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public Banco(){
        
    }
    
    public void crearCuenta(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Titular: ");
        titular = entrada.nextLine();
        System.out.println("Numero De Cuenta: ");
        numCuenta = entrada.nextInt();
        System.out.println("Saldo: ");
        saldo = entrada.nextDouble();
    }
    
    public void mostrarCuenta(){
        System.out.println("Titular: "+titular);
        System.out.println("Numero De Cuenta: "+numCuenta);
        System.out.println("Saldo: "+saldo);
    }
}
