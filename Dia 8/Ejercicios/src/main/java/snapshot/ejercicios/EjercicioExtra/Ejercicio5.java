/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
*/
package snapshot.ejercicios.EjercicioExtra;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N,M,suma=0;
        
        System.out.println("Digite la cantidad de filas que tendra su matriz");
        N = entrada.nextInt();
        System.out.println("Digite la cantidad de columnas");
        M = entrada.nextInt();
        
        int[][] matriz = new int[N][M];
        // LLENADO
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matriz[i][j] = (int) (Math.random()*10);
            }
        }
        
        //SUMA DE SUS ELEMENTOS
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                suma += matriz[i][j];
            }
        }
        
        System.out.println("La suma de sus elementos es de: "+suma);
        
    }
}
