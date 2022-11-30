package Main;

import Entidades.Listas;
import Servicios.Metodos;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        Double[] array = new Double[50];
        Double[] array2 = new Double[20];
        array = m.crearArreglo(array);
        m.mostrarArray(array);
        Arrays.sort(array);
        Listas arr = new Listas(array, m.crearArray2(array, array2));
        System.out.println(arr);
    }
}