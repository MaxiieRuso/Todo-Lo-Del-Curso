/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
*/
package snapshot.ejercicios.EjercicioExtra;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        System.out.println("digite la cantidad de elementos del vector");
        num = entrada.nextInt();
        
        int[] vector =  new int[num];
        
        vector = llenado(vector,num);
        mostrar(vector,num);
    }
    //LLENADO
    public static int[] llenado(int[] vector,int num){
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<num;i++){
            vector[i] = (int) (Math.random()*100);
        }
        
        return vector;
    }
    //MOSTRAR
    public static void mostrar(int[] vector,int num){
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<num;i++){
            System.out.print(vector[i]+"-");
        }
    }
    
}
