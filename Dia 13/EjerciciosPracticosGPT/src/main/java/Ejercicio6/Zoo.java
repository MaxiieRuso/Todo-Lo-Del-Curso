
package Ejercicio6;

import java.util.ArrayList;

public class Zoo {
    private String nombre;
    private ArrayList<Animal> listaAnimales;

    public Zoo(String nombre) {
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
    }
    
    public Zoo(){
        
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
    public void agregarAnimales(Animal animal){
        listaAnimales.add(animal);
    }
    
    public void eliminarAnimales(Animal animal){
        listaAnimales.remove(animal);
    }
    
    public int cantidadAnimales(){
        int totalAnimales=0;
        for(Animal animal : listaAnimales){
            totalAnimales++;
        }
        return totalAnimales;
    }    
}
