/*

*/
package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Vehiculo("toyota","corolla",2010,"nafta",100000);
        
        vehiculo1.mostrarVehiculo();
        
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.cargarVehiculo();
        vehiculo2.mostrarVehiculo();
    }
}
