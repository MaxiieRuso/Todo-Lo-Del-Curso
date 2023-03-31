/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá́definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.

*/
package EjerciciosExtras.Ejercicio1;


public class Main {
    public static void main(String[] args) {
        //Asi es para pasarle los parametros cuando estan vacios
        Cancion cancion1 = new Cancion("I Gotta Feelling","The Black Eyed Peas");
        
        System.out.println(cancion1.getTitulo()+" - "+ cancion1.getAutor());
        cancion1.setTitulo("Taboo");
        cancion1.setAutor("DonOmar");
        System.out.println(cancion1.getTitulo()+" - "+ cancion1.getAutor());
        
        /*
        cancion1.crearCanciones();
        System.out.println("El nombre de la cancion es: "+cancion1.getTitulo());
        System.out.println("Y el autor es: "+cancion1.getAutor());
        */
    }
}
