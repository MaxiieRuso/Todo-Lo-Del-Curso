
package EjerciciosExtras.Ejercicio4;

import java.util.Scanner;


public class Empleado {
    private String nombre;
    private double salario;
    private String cargo;
    
    public Empleado(){
        
    }
    
    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void crearEmpleado(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Digite el cargo que tiene: ");
        cargo = entrada.nextLine();  
        System.out.println("Digite su salario: ");
        salario = entrada.nextDouble();
    }
    
    public double salario(){
        if(cargo.equals("nivel1")){
            salario = salario + salario*0.10;
        }else if(cargo.equals("nivel2")){
            salario = salario + salario*0.20;
        }else if(cargo.equals("nivel3")){
            salario = salario + salario*0.30;
        }else if(cargo.equals("nivel4")){
            salario = salario + salario*0.40;
        }else if(cargo.equals("nivel5")){
            salario = salario + salario*0.50;
        }else{
            salario = salario*2;
        }
        return salario;
    } 
    
    public double extra(){
        Scanner entrada = new Scanner(System.in);
        double adicional;
        String opc;
        
        System.out.println("Adicionara dinero a su salario?");
        opc = entrada.nextLine();
        
        if(opc.equals("si")){
            System.out.println("Cuanto se adicionara?");
            adicional = entrada.nextDouble();
        }else{
            adicional = 0;
        }
        
        salario(); //Actualizo el salario segun el nivel
        //Sumo el adicional al salario actualizado
        salario += adicional;
        
        return salario;
    }   
}
