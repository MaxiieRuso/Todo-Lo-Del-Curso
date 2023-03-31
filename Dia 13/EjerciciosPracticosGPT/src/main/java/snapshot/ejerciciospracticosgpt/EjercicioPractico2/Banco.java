
package snapshot.ejerciciospracticosgpt.EjercicioPractico2;

import java.util.Scanner;

public class Banco {
    private String nombre;
    private int numCuenta;
    private double saldo;
    
    public Banco(){
        
    }
    
    public Banco(String nombre, int numCuenta, double saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumCuenta() {
        return numCuenta;
    }
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void cuantaBancaria(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el número de cuenta:");
        numCuenta = entrada.nextInt();
        System.out.println("Ingrese el saldo inicial:");
        saldo = entrada.nextDouble();
        
        int opc,dep,retiro;
        
        do{
            System.out.println("Digite una opcion:");
            System.out.println("1. Depositar");
            System.out.println("2. Retiro");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Salir");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Cuanto desea depositar?");
                    dep = entrada.nextInt();
                    saldo = saldo + dep;
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    retiro = entrada.nextInt();
                    while(retiro > saldo){
                        System.out.println("No puedes retirar mas de la cuenta");
                        System.out.println("Digite nuevamente el monto a retirar");
                        retiro = entrada.nextInt();
                    }
                    saldo = saldo - retiro;
                    break;
                case 3:
                    System.out.println("Su saldo actual es de: "+saldo);
                    break;
                case 4:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("No se encuentra esa opcion");
            }   
        }while(opc != 4);
    }
}
