/*
Crear una clase llamada "Empleado" que tenga como atributos 
"nombre" (String), "salario" (double) y "cargo" (String). 
La clase debe tener métodos para consultar y modificar el salario.
*/
package EjerciciosExtras.Ejercicio4;


public class Main {
    public static void main(String[] args) { 
        Empleado empleado1 = new Empleado();
        
        empleado1.crearEmpleado();
        
        System.out.println("El empleado "+empleado1.getNombre()
                +" tiene el cargo de "+empleado1.getCargo()
                +" Se le debe abonar "+empleado1.extra());    
    }
}
