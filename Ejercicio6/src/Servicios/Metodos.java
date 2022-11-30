package Servicios;

import Entidades.Cafetera;

import java.util.Scanner;

//Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
//(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
//actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
public class Metodos {
    Scanner sc = new Scanner(System.in);
    Cafetera cafetera = new Cafetera();

    public void llenarCafetera() {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza(int tam) {
        if (tam <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual((cafetera.getCantidadActual() - tam));
            System.out.println("La taza se llenó con " + tam + "ml");
        } else {
            System.out.println("Café insuficiente para llenar la taza");
            System.out.println("Cantidad de cafe en la taza: " + (cafetera.getCantidadActual()));
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(int tam) {
        System.out.println("Llenando...");
        if ((cafetera.getCantidadActual() + tam) <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + tam);
        } else {
            System.out.println("La cantidad supera el límite de la cantidad máxima" +
                    "\nSe llenará a tope");
            cafetera.setCantidadActual(100);
        }
    }

    public void Menu() {
        System.out.println("_______________MENU_______________");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir Taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar cafe");
        System.out.println("5. Salir");
        System.out.println("__________________________________");
        Opciones(sc.nextInt());
    }

    private void Opciones(int opc) {
        boolean continuar = true;
        switch (opc) {
            case 1 -> llenarCafetera();
            case 2 -> servirTaza(tamanioTaza());
            case 3 -> vaciarCafetera();
            case 4 -> {
                System.out.println("Cantidad de café a ingresar: ");
                agregarCafe(sc.nextInt());
            }
            case 5 -> continuar = false;
            default -> System.out.println("Opción invalida");
        }
        if (continuar)
            Menu();
        else
            System.out.println("Adiós");
    }

    public int tamanioTaza() {
        int opcion;
        System.out.println("Tamaño de taza");
        System.out.println("(1) Pequeña");
        System.out.println("(2) Mediana");
        System.out.println("(3) Grande");
        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    return 20;
                case 2:
                    return 30;
                case 3:
                    return 50;
                default:
                    System.out.println("Opción invalida, vuelva a ingresar opción");
            }
        } while (true);
    }
}
