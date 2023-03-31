
package Ejercicio7;

import java.util.Scanner;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String combustible;
    private int km;

    public Vehiculo(String marca, String modelo, int anio, String combustible, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.combustible = combustible;
        this.km = km;
    }
    
    public Vehiculo(){
        
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
    
    public void cargarVehiculo(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite Los Vehiculos De Su Inventario");
        
        System.out.println("Marca del vehiculo: ");
        marca = entrada.nextLine();
        System.out.println("Su modelo: ");
        modelo = entrada.nextLine();
        System.out.println("Anio de fabricacion: ");
        anio = entrada.nextInt();
        entrada.nextLine(); //Consumo el caracter de salto de linea
        System.out.println("El tipo de combustible: ");
        combustible = entrada.nextLine();
        System.out.println("La cantidad de km: ");
        km = entrada.nextInt();       
    }
    
    public void mostrarVehiculo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Anio: "+anio);
        System.out.println("Combustible: "+combustible);
        System.out.println("Kilometros: "+km);   
    }
}
