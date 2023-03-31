
package EjerciciosExtras.Ejercicio3;

import java.util.Scanner;


public class Juego {
    private int jugador1;
    private int jugador2;
    private int contVictorias;
    private int contPerdidas;

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }
    
    public Juego(){
        
    }

    public int getJugador1() {
        return jugador1;
    }
    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }
    public int getContVictorias() {
        return contVictorias;
    }
    public void setContVictorias(int contVictorias) {
        this.contVictorias = contVictorias;
    }
    public int getContPerdidas() {
        return contPerdidas;
    }
    public void setContPerdidas(int contPerdidas) {
        this.contPerdidas = contPerdidas;
    }
    
    
    
    public void iniciarJuego(){
        Scanner entrada = new Scanner(System.in);
        
        
        String respuesta;
        
        do{
        int intentos;
        int cont = 0;
        System.out.println("Jugador N1 digite su numero: ");
        jugador1 = entrada.nextInt();
        System.out.println("Digite el numero de intentos: ");
        intentos = entrada.nextInt();  
        System.out.println("Comienza el juego");
        do{
            System.out.println("Jugador N2 digite un numero");
            jugador2 = entrada.nextInt();
            
            if(jugador1 > jugador2){
                System.out.println("El numero es MAYOR");
            }else if(jugador1<jugador2){
                System.out.println("El numero es MENOR");
            }else{
                cont++;
                break;
            }
            cont++;
        }while(jugador1 != jugador2 && cont < intentos);
        
        if(jugador1 == jugador2 && cont <= intentos){
            contVictorias++;
            System.out.println("Adivinaste!! en "+cont+" intentos.");
        }else{
            contPerdidas++;
            System.out.println("Perdiste! u.u");
        }
            entrada.nextLine();
            System.out.println("Desea volver a jugar?");
            respuesta = entrada.nextLine();
        }while(respuesta.equals("si"));    
    }  
    
    public void jugadorGanador(int contPerdidas, int contVictorias){
        System.out.println("El jugador ganador fue!!");
        if(contVictorias > contPerdidas){
            System.out.println("El jugador N2 es el ganador con "+contVictorias+" victorias.");
        }else if(contVictorias < contPerdidas){
            System.out.println("El jugador N1 es el ganador con "+contPerdidas+" victorias.");
        }else{
            System.out.println("Hubo un empate!");
        }  
    } 
}
