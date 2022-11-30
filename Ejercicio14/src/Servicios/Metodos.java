package Servicios;

import Entidades.Movil;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Movil cargarCelular(Movil celular) {

        System.out.print("Marca: ");
        celular.setMarca(sc.nextLine());

        System.out.print("Modelo: ");
        celular.setModelo(sc.nextLine());

        System.out.print("Memoria RAM: ");
        celular.setMemoriaRam(sc.nextLine());

        System.out.print("Almacenamiento: ");
        celular.setAlmacenamiento(sc.nextLine());

        System.out.print("Precio: ");
        celular.setPrecio(sc.nextInt());

        celular = ingresarCodigo(celular);
        return celular;
    }

    private Movil ingresarCodigo(Movil celular) {
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° Numero");
            celular.getCodigo().add(sc.nextInt());
        }
        sc.nextLine();
        return celular;
    }
}
