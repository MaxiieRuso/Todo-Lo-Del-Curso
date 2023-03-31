/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/
package snapshot.ejercicios;

import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int diag,filas, columnas;
        //int[][] matriz = new int[3][3];
        //int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matriz = {{2,7,6}, {9,5,1}, {4,3,8}};
        
        /*  //LLENADO
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = entrada.nextInt();
            }
        }
        */
        diag = diagonales(matriz);
        if(diag == 0){
            System.out.println("No es un cubo magico");
        }else{
            filas = filas(matriz,diag);
            if(filas == diag){
                columnas = columnas(matriz,diag);
                if(columnas == diag){
                    System.out.println("Es un cubo magico!");
                }else{
                    System.out.println("No es un cubo magico");
                }
            }else{
                System.out.println("No es un cubo magico");
            }
        }

    }
    public static int diagonales(int[][] matriz){
        int sumaD1=0,sumaD2=0;
        int diagonal = 0;
        //DIAGONAL 1 Y DIAGONAL 2
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    sumaD1 += matriz[i][j];
                }
                if((i+j) == matriz.length-1){
                    sumaD2 += matriz[i][j];
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        } 
        if(sumaD1 == sumaD2){
            diagonal = sumaD1;
            return diagonal;
        }else{
            return diagonal;
        }
        
    }
    
    public static int filas(int[][] matriz, int diag){
        int sumaF=0;
        int filas=0;
        int cont=0;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sumaF+=matriz[i][j];
                if(sumaF == diag){
                    cont++;
                }   
            }
            sumaF=0; 
        } 
        if(cont==3){
            filas=diag;
            return filas;
        }else{
            return filas; 
        }
    }
    
    public static int columnas(int[][] matriz, int diag){
        int sumaC=0;
        int columnas=0;
        int cont=0;
        
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                sumaC+=matriz[i][j];
                if(sumaC == diag){
                    cont++;
                }   
            }
            sumaC=0; 
        } 
        if(cont==3){
            columnas=diag;
            return columnas;
        }else{
            return columnas; 
        }
    }
}
