package Main;

import Entidades.Circunferencia;

public class Main {
    public static void main(String[] args) {
        Circunferencia obj = new Circunferencia(10);
        obj.perimetro();
        obj.area();
        System.out.println(obj);
        System.out.println("__________________");

        Circunferencia obj2 = new Circunferencia();
        obj2.crearCircunferencia();
        obj2.perimetro();
        obj2.area();
        System.out.println(obj2);
        System.out.println("__________________");


        Circunferencia obj3 = new Circunferencia();
        obj3.setRadio(30);
        obj3.perimetro();
        obj3.area();
        System.out.println(obj3);
        System.out.println("__________________");

        Circunferencia obj4 = new Circunferencia(50);
        System.out.println(obj4.getRadio());
    }
}