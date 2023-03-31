
package Ejercicios.Ejercicio3;

import java.util.Scanner;


public class Operacion {
    private double numero1;
    private double numero2;
    
    public Operacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion(){
        this.numero1 = 0;
        this.numero2 = 0;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    //Metodo para crear la operacion
    public void crearOperacion(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero1: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite un numero2:");
        numero2 = entrada.nextDouble();
    }
    
    public double sumar(){
        return this.numero1 + this.numero2;
    }
    
    public double restar(){
        return this.numero1 - this.numero2;
    }
    
    public double multiplicar(){
        if(numero1==0 || numero2==0){
            System.out.println("Toda multiplicacion por 0 es igual a 0");
            return 0;
        }else{
            return this.numero1 * this.numero2;
        }
    }
    
    public double division(){
        if(numero1==0 || numero2==0){
            System.out.println("Toda division por 0 es igual a 0");
            return 0;
        }else{
            return this.numero1 / this.numero2;
        }
    }
    
}
