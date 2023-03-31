/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num, numBuscador,cont=0;
        
        
        System.out.println("Introduzca la cantidad de elementos del vector:");
        num = entrada.nextInt();
        
        int[] vector = new int[num];
        //LLENADO DEL VECTOR
        for(int i=0;i<num;i++){
            vector[i] = (int) (Math.random()*10);
            System.out.print(vector[i]+" ");
        }
        System.out.println(" ");
        
        System.out.println("Digite el numero que desea encontrar: ");
        numBuscador = entrada.nextInt();
        // BUSCANDO EL NUMERO
        for(int i=0;i<num;i++){
            if(numBuscador == vector[i]){
                System.out.println("El numero se encontro en la posicion: "+i);
                cont++;
            }
        }
        if(cont == 0){
            System.out.println("El numero no se encuentra en el vector");
        }else{
            System.out.println("Y se repite: "+cont+" veces" );
        }
        
    }
}
