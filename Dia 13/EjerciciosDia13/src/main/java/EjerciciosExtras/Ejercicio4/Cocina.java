
package EjerciciosExtras.Ejercicio4;

import java.util.Scanner;

public class Cocina {
    
    public String[] crearIngredientes(){
        Scanner entrada = new Scanner(System.in);
        
        int cant;
              
        System.out.println("Cuantos ingredientes tienes?");
        cant = entrada.nextInt();
        entrada.nextLine(); //consumo de la linea restante
        
        String [] ingredientes = new String[cant];
        System.out.println("Que ingredientes tiene?");
        
        for(int i=0;i<cant;i++){
            System.out.println("Ingrediente "+(i+1)+":");
            ingredientes[i] = entrada.nextLine();
        }
        return ingredientes;
    }
}
