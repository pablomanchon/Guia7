package Entidades;

import java.util.Arrays;

public class Listas {
    private Double[] array1, array2;

    public Listas() {
    }

    public Listas(Double[] array1, Double[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public Double[] getArray1() {
        return array1;
    }

    public void setArray1(Double[] array1) {
        this.array1 = array1;
    }

    public Double[] getArray2() {
        return array2;
    }

    public void setArray2(Double[] array2) {
        this.array2 = array2;
    }

    @Override
    public String toString() {
        return "Listas{" +
                "array1=" + Arrays.toString(array1) +
                "\narray2=" + Arrays.toString(array2) +
                '}';
    }
}
