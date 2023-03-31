/*
Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
*/
package snapshot.ejercicios.EjercicioExtra;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num,a=0,b=1,c=0;
        
        
        System.out.println("Digite la cantidad de numeros de fibonacci que quiere ver");
        num = entrada.nextInt();
        
        int[] fibo = new int[num];
        fibo[0] = 1;
        fibo[1] = 1;
        /*ECHO POR MI, MAL ECHO
        for(int i=0;i<num;i++){
            c = a + b;
            a = b + c;
            b = c + a;
            System.out.print(c+"-"+a+"-"+b+"-");
        }
        */
        for(int i=2;i<num;i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        for(int i=0;i<num;i++){
            System.out.print(fibo[i]+"-");
        }
    }
}
