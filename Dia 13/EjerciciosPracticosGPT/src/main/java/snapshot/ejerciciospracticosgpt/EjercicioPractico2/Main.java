/*
Crear una clase "Cuenta bancaria" con atributos como 
el número de cuenta, saldo y nombre del titular,
y métodos para depositar y retirar dinero.
*/
package snapshot.ejerciciospracticosgpt.EjercicioPractico2;

public class Main {
    public static void main(String[] args) {
        
        Banco banco1 = new Banco();
        
        banco1.cuantaBancaria();
        System.out.println("El duenio de la cuenta es: "+banco1.getNombre());
        System.out.println("El numero de la cuenta es: "+banco1.getNumCuenta());
        System.out.println("El saldo de la cuenta es: "+banco1.getSaldo());
    }
}
