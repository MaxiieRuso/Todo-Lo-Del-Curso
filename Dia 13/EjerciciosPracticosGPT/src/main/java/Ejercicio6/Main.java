/*
Crea una clase "Zoo" que tenga los siguientes atributos: nombre y lista de animales. 
La lista de animales debe ser una lista de objetos de la clase "Animal", 
que tendrá los siguientes atributos: nombre, especie y edad. La clase "Zoo" 
debe tener un constructor que reciba como parámetros el nombre del zoológico, 
y también debe tener getters y setters para cada uno de los atributos. Además, 
la clase "Zoo" debe tener métodos para agregar y quitar animales de la lista, 
y un método para mostrar la cantidad de animales por especie.
*/
package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        //Creo un zoologico
        Zoo zoo1 = new Zoo("Benito");
        
        //Creo algunos animales
        Animal leon = new Animal();
        Animal tigre = new Animal();
        
        //Agregamos los animales a el ZOO
        zoo1.agregarAnimales(tigre);
        zoo1.agregarAnimales(leon);
        
        //Mostramos el total de animales
        int totalAnimales = zoo1.cantidadAnimales();
        
        //Los muestro por consola
        System.out.println("El nombre del zoologico es: "+zoo1.getNombre());
        System.out.println("Y tiene: "+zoo1.cantidadAnimales()+" animales.");
        
        //Quitamos un animal
        zoo1.eliminarAnimales(leon);
        
        //Muestro el total de animales despues de quitarlo 
        totalAnimales = zoo1.cantidadAnimales();
        System.out.println("Perdon, tiene: "+zoo1.cantidadAnimales());      
    }
}
