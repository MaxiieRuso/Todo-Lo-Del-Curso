/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
*/
package snapshot.ejercicios.EjercicioExtra;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int alumnos=10, notas=4,aprobados=0,desaprobados=0;
        double[] prom;
        
        double[][] matriz = new double[alumnos][notas];
        
        matriz = llenado(matriz,alumnos,notas);
        prom = promedio(matriz,alumnos,notas);
        
        for(int i=0;i<alumnos;i++){
            if(prom[i] >= 7){
                System.out.println("El alumno numero "+(i+1)+" aprobo con una nota de "+prom[i]);
                aprobados++;
            }else{
                System.out.println("El alumno numero "+(i+1)+" NO aprobo.Su nota fue de "+prom[i]);
                desaprobados++;
            }
        }
        
        System.out.println("La cantidad de APROBADOS es de "+aprobados);
        System.out.println("La cantidad de DESCAPROBADOS es de "+desaprobados);
    }
    
    public static double[][] llenado(double[][] matriz, int alumnos, int notas){
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<alumnos;i++){
            for(int j=0;j<notas;j++){
                switch(j){
                    case 0:
                        /*System.out.println("Digite la nota del 1er trabajo practico evaluativo del alumno numero "+(i+1));
                        matriz[i][j] = entrada.nextDouble()*0.10;*/
                        matriz[i][j] =(Math.random()*10)*0.10;
                        break;
                    case 1:
                        /*System.out.println("Digite la nota del 2do trabajo practico evaluativo del alumno numero "+(i+1));
                        matriz[i][j] = entrada.nextDouble()*0.15;*/
                        matriz[i][j] =(Math.random()*10)*0.15;
                        break;
                    case 2:
                        /*System.out.println("Digite la nota del 1er integrador del alumno numero "+(i+1));
                        matriz[i][j] = entrada.nextDouble()*0.25;*/
                        matriz[i][j] =(Math.random()*10)*0.25;
                        break;
                    case 3:
                        /*System.out.println("Digite la nota del 2do integrador del alumno numero "+(i+1));
                        matriz[i][j] = entrada.nextDouble()*0.50;*/
                        matriz[i][j] =(Math.random()*10)*0.50;
                        break;
                }   
            }
        }
        return matriz;
    }
    
    public static double[] promedio(double[][] matriz,int alumnos, int notas){
        double[] prom = new double[alumnos];
        
        for(int i=0;i<alumnos;i++){
            for(int j=0;j<notas;j++){
                prom[i] += matriz[i][j];    
            }
        }
        return prom;
    }
    
    
}
