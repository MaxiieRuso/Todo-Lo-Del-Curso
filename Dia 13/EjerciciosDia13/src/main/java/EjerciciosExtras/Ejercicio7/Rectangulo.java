
package EjerciciosExtras.Ejercicio7;

import java.util.Scanner;


public class Rectangulo {
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Rectangulo(){
        
    }
    
    public void crearRectangulo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el lado del Rectangulo: ");
        lado1 = entrada.nextInt();
        System.out.println("Digite el otro lado del Rectangulo: ");
        lado2 = entrada.nextInt();
    }
    
    public void crearArea(){
        int area = lado1 * lado2;
        System.out.println(area);
    } 
}
