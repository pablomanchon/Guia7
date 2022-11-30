package Servicios;

import Entidades.Matematica;

import java.util.Random;

public class Metodos {
    Matematica numeros;

    public void crearNumeros() {
        Random rand = new Random();
        double num1 = rand.nextDouble(100), num2 = rand.nextDouble(100);
        numeros = new Matematica(Math.round(num1), Math.round(num2));
    }

    public Double devolverMayor() {
        return Math.max(numeros.getNum1(), numeros.getNum2());
    }

    public Double devolverMenor() {
        return Math.min(numeros.getNum1(), numeros.getNum2());
    }

    public Double calcularPotencia(Double may, Double men) {
        return Math.pow(may, men);
    }

    public Double calcularRaiz(Double men) {
        return Math.sqrt(men);
    }

}
