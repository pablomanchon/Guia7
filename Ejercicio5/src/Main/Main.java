package Main;

import Servicios.Servicio;

public class Main {
    public static void main(String[] args) {
        Servicio c1 = new Servicio();
        c1.crearCuenta();
        c1.Menu();
    }
}