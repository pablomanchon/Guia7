package Servicio;

import Entidades.Operacion;

import java.util.Scanner;

public class Servicios {
    Operacion op = new Operacion();
    Scanner sc = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("Ingrese los dos números: ");
        op.setN1(sc.nextDouble());
        op.setN2(sc.nextDouble());
        return op;
    }

    public double Sumar() {
        return op.getN1() + op.getN2();
    }

    public double Restar() {
        return op.getN1() - op.getN2();
    }

    public double Multiplicar() {
        if (op.getN1() == 0 || op.getN2() == 0) {
            System.out.println("ERROR: No puedo Multiplicar por 0");
            return 0;
        }
        return op.getN1() * op.getN2();
    }

    public double Dividirr() {
        if (op.getN1() == 0 || op.getN2() == 0) {
            System.out.println("ERROR: No puedo Dividir por 0");
            return 0;
        }
        return op.getN1() / op.getN2();
    }

    public double Menu() {
        System.out.println("____________________________________");
        System.out.println("Operación a realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("____________________________________");
        int opcion = sc.nextInt();
        return Opciones(opcion);
    }
    public double Opciones(int opcion) {
        switch (opcion) {
            case 1:
                return Sumar();
            case 2:
                return Restar();
            case 3:
                return Multiplicar();
            case 4:
                return Dividirr();
            default:
                System.out.println("ERROR: Opción invalida");
                System.out.println("Ingrese nuevamente una opción");
                return Menu();
        }
    }
}
