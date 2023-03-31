
package Ejercicio5;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String direccion;
    private ArrayList<Producto> listaProductos;
    
    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaProductos = new ArrayList<>();
    }
    
    public Tienda(){
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }
    
    public void quitarProducto(Producto producto) {
        listaProductos.remove(producto);
    }
    
    public double calcularTotalVentas() {
        double totalVentas = 0.0;
        for (Producto producto : listaProductos) {
            totalVentas += producto.getPrecio();
        }
        return totalVentas;
    }
}
