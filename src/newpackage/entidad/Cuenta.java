/*
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package newpackage.entidad;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String apellido;
    private long numCuenta;
    private int dni;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombre, String apellido, long numCuenta, int dni, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double ingresoDinero(double ingreso) {

        saldo = saldo + ingreso;
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Su saldo es: $" + saldo);
        System.out.println("---------------------------------------------------------------------------");
        return saldo;
    }

    public double retirarDinero(double retiro) {
        if (saldo == 0) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("No tiene dinero disponible");
            System.out.println("---------------------------------------------------------------------------");
        } else {
            saldo = saldo - retiro;
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Su saldo es de: $" + saldo);
            System.out.println("---------------------------------------------------------------------------");
        }
        return saldo;
    }

    public double extraccionRapida(double rapido) {

        double proc = saldo * 0.20;
        if (rapido > proc) {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Solo puede retirar hasta el 20% de su saldo. \nIntente nuevamente!");
            System.out.println("Su limite de retiro es de $"+proc);
            System.out.println("Su saldo es de $"+ saldo);
            System.out.println("---------------------------------------------------------------------------");
        } else {
            saldo = saldo - rapido;
            System.out.println("Su saldo es de $"+saldo);
        }
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Su saldo es de $" + saldo);
        System.out.println("---------------------------------------------------------------------------");
    }

    public void consultarDatos() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Los datos de su cuenta son: \n" + "Nombre y Apellido " + nombre + "," + apellido
                + "\n" + "DNI: " + dni + "\n" + "Numero de Cuenta: " + numCuenta + "\n");
        System.out.println("---------------------------------------------------------------------------");
    }

}

