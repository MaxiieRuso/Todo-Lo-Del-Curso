
package EjerciciosExtras.Ejercicio3;

import java.util.Scanner;

public class Juego {
    private int numero;
    
    public Juego(){
        
    }
    
    public Juego(int numero) {
        this.numero = numero;
    }
    
    public void jugar(){
        Scanner entrada = new Scanner(System.in);
        int numSecreto = (int) (Math.random()*10);
        int cont=0;
        do{
            System.out.println("Digite un numero");
            numero = entrada.nextInt();
        if(numero > numSecreto){
            System.out.println("El numero que digitaste es MAYOR");
        }else if(numero < numSecreto){
            System.out.println("El numero que digitaste es MENOR");
        }else{
            System.out.println("Correcto!!. Lo lograste en "+cont+" intentos.");
        }
        cont++;
        }while(numero != numSecreto);
    }
    
    public String reiniciar(){
        Scanner entrada = new Scanner(System.in);
        int numSecreto = (int) (Math.random()*10);
        String opc;

        System.out.println("Desea reiniciar el juego?");
        opc = entrada.nextLine();
        System.out.println("Se a reiniciado el juego.");
        return opc;
    } 
}
