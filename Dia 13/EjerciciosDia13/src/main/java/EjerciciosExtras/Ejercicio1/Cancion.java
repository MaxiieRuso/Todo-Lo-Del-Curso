
package EjerciciosExtras.Ejercicio1;

import java.util.Scanner;


public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion(){
        this.titulo = "";
        this.autor = "";
    }
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void crearCanciones(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre de la cancion: ");
        this.titulo = entrada.nextLine();
        System.out.println("Digite el autor de la cancion: ");
        this.autor = entrada.nextLine();
    }
    
    
}
