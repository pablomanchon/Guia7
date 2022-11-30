package Entidades;

public class Cuento extends Libro{
    private int volumen;
    public Cuento() {
    }
    public Cuento(int ISBN, String titulo, String autor, int numPag, int volumen){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Cuento{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPag=" + numPag +
                ", volumen=" + volumen +
                '}';
    }
}
