/*
Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
*/
package newpackage.Servicio;

import java.util.Scanner;
import newpackage.entidad.Cuenta;


public class ServicioCuenta {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cuenta crearCuenta(){
    
        System.out.println("Ingrese su Nombre: ");
        String nombre = sc.next();
        
        System.out.println("Ingrese su Apellido: ");
        String apellido = sc.next();
                
        System.out.println("Ingrese numero de cuenta: ");
        long numCuenta = sc.nextLong();
        
        System.out.println("Ingrese DNI: ");
        int dni = sc.nextInt();
        
        double saldo= 0;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Bienvenido a Banco SRC "+"\n"+"Datos de cuenta \n"+"Nombre y Apellido "+nombre+","+apellido
        +"\n"+"DNI: "+dni+ "\n"+"Numero de Cuenta: "+numCuenta+"\n");
        System.out.println("---------------------------------------------------------------------------");
        return new Cuenta (nombre,apellido,numCuenta,dni,saldo);
    }
    
}
