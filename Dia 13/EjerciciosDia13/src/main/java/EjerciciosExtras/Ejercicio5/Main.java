/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
*/
package EjerciciosExtras.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta();
        
        cuenta1.crearCuenta();
        cuenta1.retirarDinero();
        System.out.println(cuenta1.getTitular()+" te quedo "+cuenta1.getSaldo());
        
    }
}
