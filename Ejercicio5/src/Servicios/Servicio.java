package Servicios;

import Entidades.Cuenta;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
//operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
public class Servicio {
    public Cuenta c = new Cuenta();
    int opc;
    boolean continuar = true;
    private Scanner sc = new Scanner(System.in);

    public Cuenta crearCuenta() {
        System.out.println("Creación de cuenta: ");
        System.out.print("DNI: ");
        c.setDNI(sc.nextLong());
        System.out.println("Saldo inicial: ");
        c.setSaldoActual(sc.nextInt());
        c.setNumeroCuenta(generarNumeroCuenta());

        return c;
    }

    public void Menu() {
        System.out.println("______________MENU______________");
        System.out.println("Cuenta: " + c.getNumeroCuenta());
        System.out.println("1. Retirar dinero");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Extracción rápida");
        System.out.println("4. Consultar saldos");
        System.out.println("5. Consultar datos");
        System.out.println("6. Salir");
        System.out.print("Opción: ");
        Opciones(sc.nextInt());
    }

    private void Opciones(int opc) {
        switch (opc) {
            case 1 -> {
                System.out.print("Cantidad a retirar: $");
                retirarSaldo(sc.nextInt());
            }
            case 2 -> {
                System.out.print("Cantidad a depositar: $");
                ingresarSaldo(sc.nextInt());
            }
            case 3 -> {
                System.out.print("Cantidad a retirar: $");
                extraccionRapida(sc.nextInt());
            }
            case 4 -> System.out.println("Saldo actual: $" + consultarSaldo());
            case 5 -> System.out.println(consultarDatos());
            case 6 -> continuar = false;
            default -> System.out.println("Opción invalida");
        }
        if (continuar)
            Menu();
    }

    private int generarNumeroCuenta() {
        Random r = new Random();
        return r.nextInt(1, 9999);
    }

    private void ingresarSaldo(double ingreso) {
        c.setSaldoActual(c.getSaldoActual() + (int) ingreso);
    }

    private void retirarSaldo(double retiro) {
        if (retiro > c.getSaldoActual()) {
            System.out.println("Saldo insuficiente");
            System.out.println("¡Te vaciamos todo por las dudas! ¡Bienvenido a latinoamérica!");
            c.setSaldoActual(0);
        } else
            c.setSaldoActual(c.getSaldoActual() - (int) retiro);
    }

    private void extraccionRapida(int extraccion) {
        if (extraccion > c.getSaldoActual() / 20)
            System.out.println("Solo puede sacar menos del 20% en extracción rápida");
        else
            c.setSaldoActual(c.getSaldoActual() - extraccion);
    }

    private Cuenta consultarDatos() {
        return c;
    }

    private int consultarSaldo() {
        return c.getSaldoActual();
    }
}

