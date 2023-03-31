
package Ejercicio12;

import java.io.IOException;
import java.util.Scanner;

public class Carrito {
    private double gaseosa;
    private double papas;
    private double huevos;
    private double pancho;

    public Carrito(double gaseosa, double papas, double huevos, double pancho) {
        this.gaseosa = gaseosa;
        this.papas = papas;
        this.huevos = huevos;
        this.pancho = pancho;
    }
    
    public Carrito(){
        precios();
    }
    
    public void precios(){
        gaseosa = 570.80;
        papas = 100.30;
        huevos = 15.75;
        pancho = 730.20;
    }
    
    public void crearCarrito(){
        Scanner entrada = new Scanner(System.in);
        
        int opc;
        double suma=0,cant;
        
        System.out.println("Que productos llevara? ");
        do{
        System.out.println("1. Gaseosa");
        System.out.println("2. Papas");
        System.out.println("3. Huevos");
        System.out.println("4. Panchos");
        System.out.println("5. Finalizar Compra");
        
            System.out.println("Digite una opcion:");
            opc = entrada.nextInt();
        switch(opc){
            case 1:
                System.out.println("Cuantas gaseosas Llevara?");
                cant = entrada.nextInt();
                suma += gaseosa * cant;
                break;
            case 2:
                System.out.println("Cuantas papas Llevara?");
                cant = entrada.nextInt();
                suma += gaseosa * cant;
                break;
            case 3:
                System.out.println("Cuantas huevos Llevara?");
                cant = entrada.nextInt();
                suma += gaseosa * cant;
                break;
            case 4:
                System.out.println("Cuantas panchos Llevara?");
                cant = entrada.nextInt();
                suma += gaseosa * cant;
                break;
            case 5:
                System.out.println("Debe abonar: "+suma);
                break;
            default:
                System.out.println("Digito un caracter incorrecto!");
                System.out.println("Vuelva a intentarlo!");
        }
         // Limpia la consola
         /*
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }*/
        }while(opc!=5);
    } 
}
