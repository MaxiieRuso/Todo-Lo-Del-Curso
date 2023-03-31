
package EjerciciosExtras.Ejercicio6;

import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public Empleado(){
        
    }
    
    public void crearEmpleado(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();
        System.out.println("Digite el salario: ");
        salario = entrada.nextDouble();
    }
    
    public double calcularAumento(){
        if(edad >= 30){
            salario += salario*0.10;
        }else{
            salario +=salario*0.05;
        }
        return salario;
    }
    
    public void asignacionSalario(){
        System.out.println("El empleado: "+nombre);
        System.out.println("Tiene "+edad+" anios");
        System.out.println("Y se le debe abonar "+salario);
        
    }
    
}
