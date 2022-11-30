package Main;

import Servicios.Servicio;

public class Main {
    public static void main(String[] args) {
        Servicio sv = new Servicio();
        System.out.println("Rectangulo: " + sv.crearRectangulo());
        System.out.println("Perimetro del rectángulo: " + sv.Perimetro());
        System.out.println("Superficie del rectángulo: " + sv.Superficie());
        sv.dibujarRectangulo();
    }
}