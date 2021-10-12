/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
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
package banco;

import java.util.Scanner;
import newpackage.Servicio.ServicioCuenta;
import newpackage.entidad.Cuenta;

public class Banco {

    public static void main(String[] args) {
        Scanner fd = new Scanner(System.in).useDelimiter("\n");
        ServicioCuenta sc = new ServicioCuenta();
        char si = 'S';
        int numero;
        Cuenta ct = sc.crearCuenta();

        do {
            System.out.println("Ingrese opcion que desea realizar:\n 1- Depositar dinero \n"+
                    " 2- Retirar dinero\n 3- Extraccion Rapida\n 4- Consulta de Saldo\n 5- Consulta de datos\n 6- Salir ");
            numero = fd.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("Ingrese el monto a depositar: ");
                    ct.ingresoDinero(fd.nextDouble());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    ct.retirarDinero(fd.nextDouble());
                    break;

                case 3:
                    System.out.println("Ingrese el monto a retirar: ");
                    ct.extraccionRapida(fd.nextDouble());
                    break;

                case 4:
                    ct.consultarSaldo();
                    break;

                case 5:
                    ct.consultarDatos();
                    break;

                case 6:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    si = fd.next().charAt(0);
                    if (si != 's') {
                        System.out.println("ok");
                    }
                    continue;
                default:
                    System.out.println("El numero ingresado no está todavia en nuestro programa");
            }
        } while (si != 's' || numero != 6);
    }

}
