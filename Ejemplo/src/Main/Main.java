package Main;

import Entidades.Auto;
import Servicios.Servicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Servicio sv = new Servicio();
        sv.crearAuto();
        sv.mostrarAuto();
        int num = 2;
        mostrarNumero(num);
    }

    public static void mostrarNumero(int num){
        System.out.println(num);
    }


}