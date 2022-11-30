package Servicios;

import java.util.Random;

/*10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
 de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
 programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
 Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
 ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
 20.*/
public class Metodos {
    public Double[] crearArreglo(Double[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = rand.nextDouble(100);
        return arr;
    }
    public void mostrarArray(Double[] arr) {
        for (Double i : arr)
            System.out.println(i);
    }
    public Double[] crearArray2(Double[] arr, Double [] arr2) {
       for (int i = 0; i < arr2.length; i++){
           if (i < 10)
               arr2[i] = arr[i];
           else
               arr2[i] = 0.5;
       }
       return arr2;
    }
}
