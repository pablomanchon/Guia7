package Servicios;

import Entidades.Auto;

import java.util.Scanner;

public class Servicio {
    Auto a = new Auto(); //<- Creacion de objeto
    public Auto crearAuto() {
        Scanner sc = new Scanner(System.in);
        int num = 4;
        //-Modificar atributos

        a.ruedas = num;
        a.puertas = 5;
        a.setMarca("Peugeot");
        a.motor = "Diesel";
        return a;
    }
    public void mostrarAuto(){
        System.out.println(a);
    }
}
