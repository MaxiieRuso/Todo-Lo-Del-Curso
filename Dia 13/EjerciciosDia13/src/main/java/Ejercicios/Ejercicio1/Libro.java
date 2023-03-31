
package Ejercicios.Ejercicio1;

import java.util.Scanner;


public class Libro {
    //Creo los atributos
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    //Creo un constructor vacio 
    public Libro(){
        
    }
     // Constructor con todos los atributos pasados por parámetro
    public Libro(String ISBN,String titulo,String autor,int numeroPaginas){
        //Se le esta asignando un espacio en memoria
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        
    }
    
    public void cargarLibro(){
        Scanner entrada = new Scanner(System.in);
              
        System.out.println("Digite el numero ISBN: ");
        ISBN = entrada.nextLine();
        System.out.println("Digite el titulo del libro: ");
        titulo = entrada.nextLine();
        System.out.println("Digite el autor del libro: ");
        autor = entrada.nextLine();
        System.out.println("Digite el numero de paginas: ");
        numeroPaginas = entrada.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.println("El numero ISBN es: "+ISBN);
        System.out.println("El titulo del libro es: "+titulo);
        System.out.println("El autor del libro es: "+autor);
        System.out.println("Tiene "+numeroPaginas+" paginas.");   
    }
    
}
