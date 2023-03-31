
package EjerciciosExtras.Ejercicio5;

import java.util.Scanner;

public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public Cuenta(){
        
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void crearCuenta(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el nombre del titular");
        titular = entrada.nextLine();
        System.out.println("Cuanto saldo tienes?");
        saldo = entrada.nextDouble();
    }
    
    public void retirarDinero(){
        Scanner entrada = new Scanner(System.in);
        double retiro;
        
        System.out.println("RETIRO DE DINERO");
        System.out.println("Cuanto dinero retirara?");
        retiro = entrada.nextDouble();
        
        if(retiro <= saldo){
            saldo -= retiro;
            System.out.println("Tu saldo es de: "+saldo);
        }else{
            System.out.println("Imposible.No puedes retirar mas de lo que tu cuenta tiene.");
        } 
    }
    
    
}
