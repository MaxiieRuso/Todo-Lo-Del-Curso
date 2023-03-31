
package snapshot.mascotapp.entidades;


public class Mascota {
    
    private String nombre;
    public String apodo;
    //Conejo, Gato, Perro, Loro, Leon
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;
    public String raza;
    
    private int energia;
    
    public Mascota(){
        energia = 1000;
    }
    //Para diferenciarlos hay que ponerles argumentos
    public Mascota(String nombre, String apodo,String tipo){
        this.nombre = nombre; // Asignaciones a distintos objetos. This hace referebcua a la clase
        this.apodo = apodo;
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Leon")){
            this.tipo = tipo;
        }
        this.energia = 1000;
        
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
        //Con logica
        
        if(nombre.length() > 0){
            this.nombre = nombre;
        }
        this.energia = 1000;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    /**
     * Funcion destinada a pasear
     * @param energiaRestar
     * @return 
     */

    public int pasear(int energiaRestar){
        
        //energia = energia - energiaRestar;
        //O 
        energia -= energiaRestar;
        return energia;
    }
    /**
     * Sirve para documentar
     * @param energiaRestar
     * @param vueltas
     * @return 
     */
    
    public int pasear(int energiaRestar,int vueltas){
        
        for(int i=0;i<vueltas;i++){
            energia -= energiaRestar;
        }
        
        return energia;
    }


    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
    
    
}
