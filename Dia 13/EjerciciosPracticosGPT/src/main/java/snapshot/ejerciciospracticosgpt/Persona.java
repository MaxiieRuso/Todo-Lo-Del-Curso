
package snapshot.ejerciciospracticosgpt;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String deporte;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, int edad, String deporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    } 
    public void crearPersona(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digita el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); //Consume salto de linea restante
        System.out.println("Digite el deporte: ");
        deporte = entrada.nextLine(); 
    }
    
    public void mostrarPersona(){
        System.out.println("Digita el nombre: "+nombre);
        System.out.println("Digite la edad: "+edad);
        System.out.println("Digite el deporte: "+deporte);
    }  
}
