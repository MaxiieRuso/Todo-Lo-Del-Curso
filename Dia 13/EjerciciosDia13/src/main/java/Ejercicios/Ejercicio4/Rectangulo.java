
package Ejercicios.Ejercicio4;

import java.util.Scanner;


public class Rectangulo {
    private int base;
    private int altura;
    // Creacion de los constructores
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int Superficie(){
        return this.base * this.altura;
    }
    
    public int Perimetro(){
        return (this.base + this.altura) * 2;
    }
    
    //Dibujo con asteriscos
    public void dibujoAsteriscos(){
        
        for(int i=0;i<altura;i++){
            for(int j=0;j<base;j++){
                if(i==0 ||  i==altura-1 ||  j==0 || j==base-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
