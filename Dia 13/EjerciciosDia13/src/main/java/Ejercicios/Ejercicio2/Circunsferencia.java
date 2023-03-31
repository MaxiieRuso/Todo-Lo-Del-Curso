
package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class Circunsferencia {
    private double radio;
    
    public Circunsferencia(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunsferencia(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el radio: ");
        radio = entrada.nextDouble();
    }
    
    public double area(){     
        return Math.PI * Math.pow(radio, 2); 
    }
    
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}
