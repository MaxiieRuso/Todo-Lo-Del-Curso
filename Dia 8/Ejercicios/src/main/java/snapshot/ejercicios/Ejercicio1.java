/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        for(int i=100;i>0;i--){
            System.out.println(i);
        }
            
    }
}
