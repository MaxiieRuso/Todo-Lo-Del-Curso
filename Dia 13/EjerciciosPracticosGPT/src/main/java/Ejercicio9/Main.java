/*
Crear una clase llamada "CuentaBancaria" con los atributos 
"saldo", "titular" y "número de cuenta". 
Luego, implementar métodos para transferir dinero entre dos cuentas bancarias.
*/
package Ejercicio9;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        cuentaBancaria cuenta1 = new cuentaBancaria();
        cuenta1.crearCuenta();
        cuenta1.mostrarCuenta();
        
        cuentaBancaria cuenta2 = new cuentaBancaria();
        cuenta2.crearCuenta();
        cuenta2.mostrarCuenta();
        
        System.out.println("Tranpaso de dinero de cuenta1 a cuenta2");
        Scanner entrada = new Scanner(System.in);
        double cantidad = entrada.nextDouble();
        cuenta1.transferir(cuenta2, cantidad);
        
        System.out.println("El saldo actual de cuenta1 es: "+cuenta1.getSaldo());
        System.out.println("El saldo actual de cuenta2 es: "+cuenta2.getSaldo());
    }
}
