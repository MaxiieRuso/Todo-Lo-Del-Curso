/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
package Ejercicios.Ejercicio4;


public class Main {
    public static void main(String[] args) {
        
        Rectangulo rectangulo1 = new Rectangulo(9,4);
        
        System.out.println("La superficie del rectangulo es: "+rectangulo1.Superficie());
        System.out.println("El perimetro del rectangulo es: "+rectangulo1.Perimetro());
        rectangulo1.dibujoAsteriscos();
        
         Rectangulo rectangulo2 = new Rectangulo(3,6);
        
        //rectangulo1.crearRectangulo();
        System.out.println("La superficie del rectangulo es: "+rectangulo2.Superficie());
        System.out.println("El perimetro del rectangulo es: "+rectangulo2.Perimetro());
        rectangulo2.dibujoAsteriscos();
        
    }
}
