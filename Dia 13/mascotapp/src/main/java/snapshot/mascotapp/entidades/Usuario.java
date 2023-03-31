
package snapshot.mascotapp.entidades;

import java.util.Date;


public class Usuario {
    public String nombre;
    public String appelido;
    public int dni;
    public Date nacimiento;
    public String pais;
    
    public Usuario(){
        
    }

    public Usuario(String nombre, String appelido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.appelido = appelido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
    
}
