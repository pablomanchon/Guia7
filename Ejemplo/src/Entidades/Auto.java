package Entidades;

public class Auto {
    //-Atributos

    public int ruedas;
    public int puertas;
    private String marca;
    public String motor;

    //-Constructores

    public Auto() {
    }

    public Auto(int ruedas, int puertas, String marca, String motor) {
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.marca = marca;
        this.motor = motor;
    }

    //- Getters and setters

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

//- toString

    @Override
    public String toString() {
        return "Auto{" +
                "ruedas=" + ruedas +
                ", puertas=" + puertas +
                ", marca='" + marca + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
