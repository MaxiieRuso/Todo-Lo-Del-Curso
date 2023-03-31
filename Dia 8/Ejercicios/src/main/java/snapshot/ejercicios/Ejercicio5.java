/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int[][] matriz = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matrizAn = new int[3][3];
        //int[][] matriz = {{0,-2,4}, {2,0,0}, {-4,-2,0}};
        
        int cont=0;
        
        /*
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Digite un numero");
                matriz[i][j] = entrada.nextInt();
            }
        }*/
        
        llenado(matriz);
        matriz2 = llenado2(matriz);
        matrizAn = antisimetrica(llenado2(matriz));
            
         for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                if(matriz2[i][j] == -(matrizAn[i][j])){
                    cont++;
                }
            }
        }
         
        if(cont == 9){
            System.out.println("La matriz es ANTISIMETRICA");
        }else{
            System.out.println("La matriz NO es antisimetrica");
        }
        
        
        
    }
    // LLENADO DE LA MATRIZ PRINCIPAL
    public static int[][] llenado(int[][] matriz){
        //int[][] matriz = new int[3][3];
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 0;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        
        return matriz;
    }
    
    // INT[][]
    private static int[][] llenado2(int[][] matriz) {
        int[][] matriz2 = new int[3][3];
        
        // LLENADO DE LA MATRIZ 2
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                matriz2[i][j] = matriz[j][i];
            }
        }
        System.out.println("MATRIZ 2 ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        return matriz2;
    }
    
    //ANTISIMETRICA
    public static int[][] antisimetrica(int[][] matriz2){
         // ANTISIMETRICA
        for(int j=0;j<3;j++){
            for(int i=0;i<3;i++){
                matriz2[i][j] = matriz2[i][j]*(-1);
            }
        }
        System.out.println("MATRIZ 2 ANTISIMETRICA");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        return matriz2;
    }
}
