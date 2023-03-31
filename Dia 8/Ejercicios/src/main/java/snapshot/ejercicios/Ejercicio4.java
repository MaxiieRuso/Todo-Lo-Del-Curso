/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int filas=4,columnas=4;
        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];
        //LLENADO
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j]= (int) (Math.random()*100);
            }
        }
        //MOSTRAR
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println(" ");
        
        //MOSTRAR TRANSPUESTA 
        for(int j=0;j<4;j++){
            for(int i=0;i<4;i++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        /*
        //TRANSPONER EN OTRA MATRIZ
        for(int j=0;j<4;j++){
            for(int i=0;i<4;i++){
                matriz2[j][i] = matriz[j][i];
            }
        }
        //MOSTRAR TRANSPUESTA
        for(int j=0;j<4;j++){
            for(int i=0;i<4;i++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }*/
    }
}
