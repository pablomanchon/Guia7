package Servicio;

import Entidades.Cancion;

import java.util.Scanner;
import java.util.Vector;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    Vector<Cancion> canciones = new Vector<Cancion>();

    public void menu() {
        System.out.println("_______________MENU_______________" +
                "\n1. Crear cancion." +
                "\n2. Borrar cancion." +
                "\n3. Mostrar canciones." +
                "\n4. Salir.");
        opcionesMenu(sc.nextInt());
    }

    private void opcionesMenu(int opcion) {
        sc.nextLine();
        switch (opcion) {
            case 1 -> crearCancion();
            case 2 -> borrarCancion();
            case 3 -> mostrarCanciones();
            case 4 -> System.out.println("Adios :)");
            default -> System.out.println("Opción invalida");
        }
    }

    private void borrarCancion() {
        String cancionBorrar;
        boolean encontrarCancion = false;

            System.out.println("¿Qué cancion desea borrar?");
            cancionBorrar = sc.nextLine();

        for (int i = 0; i < canciones.size(); i++) {

            if (canciones.get(i).getTitulo().equalsIgnoreCase(cancionBorrar)){
                canciones.remove(i);
                encontrarCancion = true;
            }
        }
        if (!encontrarCancion)
            System.out.println("No se encontró la canción");
        menu();
    }

    public void crearCancion() {
        do {
            Cancion cancion = new Cancion();

            System.out.print("Autor: ");
            cancion.setAutor(sc.nextLine());

            System.out.print("Canción: ");
            cancion.setTitulo(sc.nextLine());

            canciones.add(cancion);
        } while (agregarOtra());
        menu();
    }

    public boolean agregarOtra() {
        String opcion;
        do {
            System.out.println("¿Desea agregar otra canción? (si/no)");
            opcion = sc.nextLine().toLowerCase();

            if (!opcion.equals("si") && !opcion.equals("no"))
                System.out.println("Ingrese una opcion correcta");

        } while (!opcion.equals("si") && !opcion.equals("no"));

        return opcion.equals("si");
    }

    public void mostrarCanciones() {
        System.out.println(canciones);
        menu();
    }
}
