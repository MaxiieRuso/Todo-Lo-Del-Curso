/*
Crear una clase "Bank" que tenga una lista de cuentas bancarias y métodos para agregar cuentas, 
buscar cuentas por número de cuenta y eliminar cuentas por número de cuenta.
*/
package Ejercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int cant;
        System.out.println("Cuantas cuentas creara?");
        cant = entrada.nextInt();

        Banco[] listaCuenta = new Banco[cant]; 
        
        for(int i=0;i<cant;i++){
            Banco nuevaCuenta = new Banco(); //Crea una nueva instancia en cada iteracion
            nuevaCuenta.crearCuenta();
            listaCuenta[i] = nuevaCuenta;
        }
        
        for(int i=0;i<cant;i++){
            listaCuenta[i].mostrarCuenta();
        }
    }
}
