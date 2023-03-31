
package snapshot.mascotapp;

import java.util.Scanner;
import snapshot.mascotapp.entidades.Mascota;

public class Mascotapp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Creamos un objeto
        Mascota m1 = new Mascota("Osvaldo",entrada.next(),"Perro");
        
        /*
        //creada mi primero mascota
        m1.apodo = "Chiquito";
        m1.nombre = entrada.next(); //Y puedo usar todos los metodos de Scanner
        m1.tipo = "Perro";
        m1.edad = 14;
        m1.raza = "Labrador";
        m1.cola = true;
        m1.color = "Tricolor";
*/
        //Empezar a crear todos los objetos que quiera
        Mascota m2 = new Mascota();
        Mascota m3 = new Mascota();
        
        //Reasignamos un valor
        //m1.setNombre("Aron");
        //System.out.println(m1.getNombre());
        
        // Me muestra todos los datos
        System.out.println(m1.toString());
        m1.pasear(100);
        
        System.out.println(m1.toString());
        
        //System.out.println(m1.apodo+" "+m1.edad+" "+m1.tipo+" "+m1.color);
        
    }
}
