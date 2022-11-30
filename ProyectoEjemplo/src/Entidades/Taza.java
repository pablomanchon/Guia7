package Entidades;

public class Taza {
    //Atributos

    private String material;
    private String color;
    public String tamanio;
    public int volumen;

    //Constructor
    public Taza() {
    }

    public Taza(String material, String color, String tamaño, int volumen) {
        this.material = material;
        this.color = color;
        this.tamanio = tamaño;
        this.volumen = volumen;
    }

    //Getters and setters


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Taza{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", tamaño='" + tamanio + '\'' +
                ", volumen=" + volumen +
                '}';
    }
}

