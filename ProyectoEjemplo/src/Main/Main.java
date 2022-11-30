package Main;

import Entidades.asd;
import Servicios.Metodos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*asd caca = new asd();
        caca.setNum(5);
        System.out.println(Math.pow(caca.getNum(), 2));
        int num1 = 3, num2 = 2, num3 = 9;
        double potencia, raiz, random;
        potencia = Math.pow(num1, 5); //<- Sacar una potencia
        raiz = Math.sqrt(num3); //<- Sacar una raiz cuadrada
        random = Math.random()*100; //<- Random con rango 100*/
        int[] num = new int[5];
        Random rand = new Random();
        for (int i = 0; i < num.length; i++)
            num[i] = rand.nextInt(0, 10);
        imprimirArray(num);
        Arrays.sort(num);
        System.out.println();
        imprimirArray(num);
    }

    private static void imprimirArray(int[] num) {
        for (int i : num)
            System.out.print(i + "|");
    }
}