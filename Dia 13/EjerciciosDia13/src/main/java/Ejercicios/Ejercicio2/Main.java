/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
*/
package Ejercicios.Ejercicio2;


public class Main {
    public static void main(String[] args) {
        
        Circunsferencia cir1 = new Circunsferencia(5.0);
        cir1.crearCircunsferencia();
        System.out.println("El area de la circunsferencia es: "+cir1.area());
        System.out.println("El perimetro de la circunsferencia es: "+cir1.perimetro());
    }
}
