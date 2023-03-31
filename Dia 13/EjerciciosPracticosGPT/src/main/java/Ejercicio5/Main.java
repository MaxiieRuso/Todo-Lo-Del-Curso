/*
Crea una clase "Tienda" que tenga los siguientes atributos: 
nombre, dirección y lista de productos. La lista de productos 
debe ser una lista de objetos de la clase "Producto", que tendrá 
los siguientes atributos: nombre, descripción y precio. La clase "Tienda" 
debe tener un constructor que reciba como parámetros el nombre y la dirección 
de la tienda, y también debe tener getters y setters para cada uno de los atributos. 
Además, la clase "Tienda" debe tener métodos para agregar y quitar productos de la lista, 
y un método para calcular el total de ventas de la tienda.
*/
package Ejercicio5;

// Lo hise todo con chatGPT
public class Main {
    public static void main(String[] args) {
        // Creamos una tienda
        Tienda tienda = new Tienda("Mi Tienda", "Calle Falsa 123");
        
        // Creamos algunos productos
        Producto producto1 = new Producto("Producto 1", "Descripción del producto 1", 100.0);
        Producto producto2 = new Producto("Producto 2", "Descripción del producto 2", 200.0);
        Producto producto3 = new Producto("Producto 3", "Descripción del producto 3", 300.0);
        
        // Agregamos los productos a la tienda
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);
        
        // Calculamos el total de ventas de la tienda
        double totalVentas = tienda.calcularTotalVentas();
        
        // Mostramos los resultados por consola
        System.out.println("Nombre de la tienda: " + tienda.getNombre());
        System.out.println("Dirección de la tienda: " + tienda.getDireccion());
        System.out.println("Total de ventas: " + totalVentas);
        
        // Quitamos un producto de la tienda
        tienda.quitarProducto(producto2);
        
        // Calculamos el total de ventas de la tienda nuevamente
        totalVentas = tienda.calcularTotalVentas();
        
        // Mostramos los resultados por consola
        System.out.println("Total de ventas después de quitar un producto: " + totalVentas);
    }
}
