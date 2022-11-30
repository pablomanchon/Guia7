package Entidades;

import java.util.Scanner;

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
public class Circunferencia {
    //Atributos
    private double radio;
    private double perimetro;
    private double area;


    //Constructores
    public Circunferencia(){

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //Get y Set
    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Funciones y/o Metodos
    public double area() {
        this.area = Math.PI * Math.pow(this.radio, 2);
        return this.area;
    }
    public double perimetro() {
        this.perimetro = 2*Math.PI * this.radio;
        return this.perimetro;
    }

    public double crearCircunferencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        return this.radio=scanner.nextDouble();
    }


    //ToString


    @Override
    public String toString() {
        return "Circunferencia{" +
                "radio=" + radio +
                ", perimetro=" + perimetro +
                ", area=" + area +
                '}';
    }
}
