/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". 
Luego, crea métodos para agregar nuevas recetas a la lista, 
para buscar una receta por nombre y para obtener la lista de recetas 
que se pueden preparar con los ingredientes disponibles en la cocina.
NO ERA NECESARIO HACERLO PORQUE ESTO ES MAS AVANZADO QUE LO QUE VENIAMOS VIENDO
*/
package EjerciciosExtras.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cocina cocina1 = new Cocina();
        
        String[] ingredientes = cocina1.crearIngredientes();
        
        for(int i=0;i<ingredientes.length;i++){
            System.out.println(ingredientes[i]);
        }
        
        String[][] recetas = {{"papas", "huevos", "jugo"},
                     {"papas", "sal", "gaseosa"},
                     {"papas", "picada", "fernet"}};
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                if(ingredientes[j].equals(recetas[i][j])){
                    System.out.println("Con esos elementos puedes hacer: Tortilla");
                    break;
                }else if(ingredientes[j].equals(recetas[i][j])){
                    System.out.println("Con esos elementos puedes hacer: Papas Fritas");
                    break;
                }else if(ingredientes[j].equals(recetas[i][j])){
                    System.out.println("Con esos elementos puedes hacer: Pastel De Papa");
                    break;
                }
            }
        }  
    }
}
