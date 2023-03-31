/*
Crear una clase "Juego" que tenga un método "jugar" que acepte un número como parámetro 
y devuelva un mensaje que indique si el número es mayor o menor que un número secreto almacenado en la clase. 
También debería tener un método para reiniciar el juego y elegir un nuevo número secreto.
*/
package EjerciciosExtras.Ejercicio3;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Juego juego1 = new Juego();
        String opc;
        
        juego1.jugar();
        // Para reiniciar el juego
        do{
        opc = juego1.reiniciar();
        
        if(opc.equals("si")){
            juego1.jugar();
        }else{
            System.out.println("Juego Finalizado");
        }
        }while(!opc.equals("no"));
    }
}
