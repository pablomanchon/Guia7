package Servicios;

import Entidades.Rectangulo;

import java.util.Scanner;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura. Se deberán además definir los métodos getters, setters y constructores
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
public class Servicio {
    Rectangulo rec = new Rectangulo();

    public Rectangulo crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base del rectangulo: ");
        rec.setBase(sc.nextDouble());
        System.out.print("Altura del rectangulo: ");
        rec.setAltura(sc.nextDouble());
        return rec;
    }

    public double Superficie() {
        return rec.getBase() * rec.getAltura();
    }

    public double Perimetro() {
        return (rec.getAltura() + rec.getBase()) * 2;
    }

    public String dibujarRectangulo() {
        System.out.println("_________________________________________");
        String rectangulo = "a";
        double base = rec.getBase(), altura = rec.getAltura();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura-1 || j == 0 || j == base-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        return rectangulo;
    }

}
