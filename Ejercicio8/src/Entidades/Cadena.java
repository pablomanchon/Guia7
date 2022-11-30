package Entidades;

public class Cadena {
    private String frase;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "frase='" + frase + '\'' +
                '}';
    }
}
