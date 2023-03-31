
package Ejercicio6;

import java.util.Scanner;

public class Animal {
    private String nombre;
    private String especie;
    private int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void agregarAnimalesAlZoo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre del animal");
        nombre = entrada.nextLine();
        System.out.println("Que especie es? ");
        especie = entrada.nextLine();
        System.out.println("Que edad tiene?");
        edad = entrada.nextInt();   
    }
    
    public Animal(){
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
