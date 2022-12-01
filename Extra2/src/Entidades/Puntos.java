package Entidades;

import java.util.Arrays;

/*2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
        atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
        usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
        los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
        que existe entre los dos puntos que existen en la clase Puntos.*/
public class Puntos {

    private Integer[] x, y;
    private Double distancia;

    public Puntos() {
    }

    public Puntos(Integer[] x, Integer[] y, Double distancia) {
        this.x = x;
        this.y = y;
        this.distancia = distancia;
    }

    public Integer[] getX() {
        return x;
    }

    public void setX(Integer[] x) {
        this.x = x;
    }

    public Integer[] getY() {
        return y;
    }

    public void setY(Integer[] y) {
        this.y = y;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Puntos{" +
                "x=" + Arrays.toString(x) +
                ", y=" + Arrays.toString(y) +
                ", distancia=" + distancia +
                '}';
    }
}
