/*
Crea una clase "Cine" con los siguientes atributos: lista de películas y número de asientos. 
Incluye métodos para agregar y eliminar películas, 
y para calcular la cantidad de ingresos generados por todas las películas.
*/
package Ejercicio8;


public class Main {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador();
        
        jugador1.crearJugador();
        System.out.println("El equipo "+jugador1.getEquipo()+" tiene como jugadores: "
                + jugador1.getNombre()+" e hizo "+jugador1.getPuntos()+" puntos.");
        
        
    }
}
