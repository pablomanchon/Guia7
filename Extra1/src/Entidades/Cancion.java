package Entidades;

public class Cancion {
    String autor, titulo;

    public Cancion() {
    }

    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "\n________________________" +
                "\nautor: " + autor +
                "\ntitulo: " + titulo
                + "\n________________________";
    }
}
