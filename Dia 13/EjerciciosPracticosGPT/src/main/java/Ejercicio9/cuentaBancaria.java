
package Ejercicio9;

import java.util.Scanner;

public class cuentaBancaria {
    private double saldo;
    private String titular;
    private int numeroDeCuenta;

    public cuentaBancaria(double saldo, String titular, int numeroDeCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    public cuentaBancaria(){
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void crearCuenta(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre del titular de la cuenta: ");
        titular = entrada.nextLine();
        System.out.println("Digite el numero de cuenta: ");
        numeroDeCuenta = entrada.nextInt();
        System.out.println("Digite el saldo: ");
        saldo = entrada.nextDouble();   
    }
    
    public void mostrarCuenta(){
        System.out.println("Titular: "+titular);
        System.out.println("Numero De Cuenta: "+numeroDeCuenta);
        System.out.println("Saldo: "+saldo);
    }
    
    public void depositar(double cantidad){
        saldo += cantidad;
    }
    
    public void retirar(double cantidad){
        if(saldo>=cantidad){
            saldo-=cantidad;
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void transferir(cuentaBancaria cuentaDestino, double cantidad){
        if(saldo>=cantidad){
            saldo-=cantidad;
            cuentaDestino.depositar(cantidad);
        }else{
            System.out.println("Saldo insuficiente");
        }    
    }   
}
