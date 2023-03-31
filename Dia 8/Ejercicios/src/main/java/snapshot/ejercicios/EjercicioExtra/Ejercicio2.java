/*
Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
*/
package snapshot.ejercicios.EjercicioExtra;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num1,num2,diferencia;
        
        System.out.println("digite la cantidad de elementos que tendra el vector numero 1");
        num1 = entrada.nextInt();
        int[] vector1 = new int[num1];
        System.out.println("digite la cantidad de elementos que tendra el vector numero 2");
        num2 = entrada.nextInt();
        int[] vector2 = new int[num2];
        
        if(num1 != num2){
            System.out.println("Los vectores son diferentes");
        }else{
            vector1 = llenado1(vector1,num1);
            vector2 = llenado2(vector2,num2);
            diferencia = comparacion(vector1,vector2,num2);
            if(diferencia == num2){
                System.out.println("Los vectores son IGUALES");
            }else{
                System.out.println("Los vectores son DISTINTOS");
            }
        }
    }
    
    public static int[] llenado1(int[] vector1,int num1){
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<num1;i++){
            System.out.println("Digite un numero para el vector 1");
            vector1[i] = entrada.nextInt();
        }
        
        return vector1;
    }
    
    public static int[] llenado2(int[] vector2,int num2){
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0;i<num2;i++){
            System.out.println("Digite un numero para el vector 2");
            vector2[i] = entrada.nextInt();
        }
        
        return vector2;
    }
    
    public static int comparacion(int[] vector1,int[] vector2,int num2){
        
        int cont=0;
        
        for(int i=0;i<num2;i++){
            if(vector1[i] != vector2[i]){
                break;
            }else{
                cont++;
            }
        }
        return cont;
    }
}
