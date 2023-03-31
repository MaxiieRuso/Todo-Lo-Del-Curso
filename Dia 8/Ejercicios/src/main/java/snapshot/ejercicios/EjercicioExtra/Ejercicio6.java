/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().
*/
package snapshot.ejercicios.EjercicioExtra;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String[] palabras = new String[5];
        String[][] matriz = new String[20][20];
        
        for(int i=0;i<5;i++){
            do{
            System.out.println("Digite una palabra que tenga de 3 a 5 caracteres: ");
            palabras[i] = entrada.nextLine().toUpperCase();
        }while(palabras[i].length()<=2 || palabras[i].length()>=6);
        }
        /*
        for(int i=0;i<5;i++){
            System.out.println(palabras[i]);
        }        
        */
        matriz = sopaLetra(matriz);
        completadoSopa(matriz,palabras);
        
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                System.out.print(matriz[i][j]+" ");
            }
             System.out.println(" ");
        }
        
    }
    //LLENADO
    public static String[][] sopaLetra(String[][] matriz){
        int nums;
        
        for(int i=0;i<20;i++){
            nums = (int) (Math.random()*10);
            for(int j=0;j<20;j++){
                matriz[i][j] =  Integer.toString(nums);
            }
        }
        return matriz;
    }
    
    public static void completadoSopa(String[][] matriz,String[] palabras){
        Scanner entrada = new Scanner(System.in);
        int insertado,auxiliar;
        
        insertado = (int) (Math.random()*20);
        auxiliar = insertado;
        
        for(int i=0;i<5;i++){
            for(int j=0;j<palabras[i].length();j++){
                matriz[insertado][j] = palabras[i].substring(j,j+1);
                auxiliar = insertado;
            }
            do{
                insertado = (int) (Math.random()*20);
            }while(auxiliar == insertado);

        }
    }
}
