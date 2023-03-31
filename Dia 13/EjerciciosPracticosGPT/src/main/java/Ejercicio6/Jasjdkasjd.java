
package Ejercicio6;

import java.util.ArrayList;
import java.util.HashMap;

public class Jasjdkasjd {
    

public class Animal {
    private String nombre;
    private String especie;
    private int edad;

    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
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

public class Zoo {
    private String nombre;
    private ArrayList<Animal> listaAnimales;

    public Zoo(String nombre) {
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    public void quitarAnimal(Animal animal) {
        listaAnimales.remove(animal);
    }

    public void cantidadAnimalesPorEspecie() {
        HashMap<String, Integer> cantidadPorEspecie = new HashMap<>();
        for (Animal animal : listaAnimales) {
            String especie = animal.getEspecie();
            cantidadPorEspecie.put(especie, cantidadPorEspecie.getOrDefault(especie, 0) + 1);
        }
        System.out.println("Cantidad de animales por especie:");
        for (String especie : cantidadPorEspecie.keySet()) {
            int cantidad = cantidadPorEspecie.get(especie);
            System.out.println(especie + ": " + cantidad);
        }
    }
}
}
