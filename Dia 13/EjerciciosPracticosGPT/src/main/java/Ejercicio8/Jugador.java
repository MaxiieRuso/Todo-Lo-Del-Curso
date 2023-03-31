
package Ejercicio8;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private int puntos;
    private String equipo;

    public Jugador(String nombre, int puntos, String equipo) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.equipo = equipo;
    }
    
    public Jugador(){
        
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public String getEquipo() {
        return equipo;
    }
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    public void crearJugador(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre del jugador: ");
        nombre = entrada.nextLine();
        System.out.println("Digite el equipo en el que juega: ");
        equipo = entrada.nextLine();
        System.out.println("Digite los puntos que encesto: ");
        puntos = entrada.nextInt();    
    }
}
