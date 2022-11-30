package Main;

import Entidades.Cuento;
import Entidades.Libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Libro l1 = new Libro();   //!<-- Sin parametros

        l1.setISBN(1350);
        l1.setNumPag(1000);
        l1.setAutor("Pepe Honguito");
        l1.setTitulo("Game of thrones");

        //!- Con parametrosw
        Libro l2 = new Libro(1111,"Dejar de Fumar", "Bob Marley", 10);

        System.out.println(l1);


        Cuento cuento1 = new Cuento();
        cuento1.setTitulo("Alicia en el Pais de las Maravillas");
        cuento1.setAutor("Michael Jackson");
        cuento1.setISBN(9789);
        cuento1.setNumPag(2500);
        cuento1.setVolumen(3);

        System.out.println(cuento1);
    }
}
