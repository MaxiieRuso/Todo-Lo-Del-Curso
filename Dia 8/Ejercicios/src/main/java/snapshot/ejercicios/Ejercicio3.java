/*Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package snapshot.ejercicios;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num,cont=1;
        
        System.out.println("Digite la cantidad de elementos del vector");
        num = entrada.nextInt();
        
        int[] vector = new int[num];
        
        for(int i=0;i<num;i++){
            vector[i]= (int) (Math.random()*100000);
            System.out.println(vector[i]);
        }
        
        for(int i=0;i<num;i++){
            
            do{
                vector[i] = vector[i]/10;
                cont++;
            }while(vector[i] > 9);

            switch(cont){
                case 1:
                    System.out.println("El vector en la posicion "+i+" es de 1 digito");
                    break;
                case 2:
                    System.out.println("El vector en la posicion "+i+" es de 2 digitos");
                    break;
                case 3:
                    System.out.println("El vector en la posicion "+i+" es de 3 digitos");
                    break;
                case 4:
                    System.out.println("El vector en la posicion "+i+" es de 4 digitos");
                    break;
                case 5:
                    System.out.println("El vector en la posicion "+i+" es de 5 digitos");
                    break;
                default:
                    System.out.println("El numero es superior a los 5 digitos");
            }
            cont=1;
        }
        
    }
}
