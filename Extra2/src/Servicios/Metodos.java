package Servicios;

import Entidades.Puntos;

import java.util.Scanner;

public class Metodos {

    Scanner sc = new Scanner(System.in);
    Puntos punto = new Puntos();

    public void crearPuntos() {
        Integer[] x = new Integer[2], y = new Integer[2];
        for (int i = 0; i < 2; i++) {

            System.out.println("Ingrese el valor de x" + (i + 1));
            x[i] = sc.nextInt();

            System.out.println("Ingrese el valor de y" + (i + 1));
            y[i] = sc.nextInt();
        }
        punto.setX(x);
        punto.setY(y);
        punto.setDistancia(calcular());
        System.out.println(punto);
    }

    public Double calcular() {
        Double x2x1 = Math.pow(((double)punto.getX()[1]-(double)punto.getX()[0]),2);
        Double y2y1 = Math.pow(((double)punto.getY()[1]-(double)punto.getY()[0]),2);
        return Math.sqrt(x2x1 + y2y1);
    }
}
