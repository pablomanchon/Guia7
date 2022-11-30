package Servicios;

import Entidades.Cadena;

import java.util.Scanner;


public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Cadena crearCadena(Cadena frase) {
        System.out.println("Ingrese una frase");
        frase.setFrase(sc.nextLine());
        System.out.println("Frase: " + frase.getFrase());
        return frase;
    }

    public void mostrarVocales(String frase) {
        String letra;
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);
            cont += contarVocales(letra);
        }
        System.out.println("La frase " + frase + " cotiene " + cont + " Vocales");
    }

    private int contarVocales(String letra) {
        int cont = 0;
        switch (letra.toUpperCase()) {
            case "A", "E", "I", "O", "U" -> cont++;
        }
        return cont;
    }

    public void invertirFrase(String frase) {
        StringBuilder frase2 = new StringBuilder(frase);
        System.out.println("Frase invertida: " + frase2.reverse());
    }

    public void vecesRepetido(String frase) {
        System.out.println("Ingrese un caracter");
        String caracter = sc.nextLine();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (caracter.equalsIgnoreCase(frase.substring(i, i + 1)))
                cont++;
        }
        System.out.println("El caracter " + caracter + " se repite " + cont + " veces");
    }

    public void compararLongitud(String frase) {
        System.out.println("Ingrese una frase: ");
        String frase2 = sc.nextLine();
        if (frase.length() > frase2.length())
            System.out.println("La frase 1 es mas larga que la frase 2");
        else if (frase2.length() > frase.length())
            System.out.println("La frase 2 es mas larga que la frase 1");
        else
            System.out.println("Ambas frases tienen la misma longitud");
        unirFrases(frase, frase2);
    }

    private void unirFrases(String frase, String frase2) {
        String frasesUnidas = frase + " " + frase2;
        System.out.println("Frases unidas: " + frasesUnidas);
    }
    public void reemplazar(String frase){
        StringBuilder f = new StringBuilder(frase);
        System.out.println("Ingrese un caracter: ");
        String caracter = sc.nextLine();
        for (int i = 0; i < frase.length(); i++){
            if (frase.substring(i, i + 1).equalsIgnoreCase("a"))
                f.replace(i, i+1, caracter);
        }
        System.out.println(f);
    }
    public boolean contiene(String frase){
        System.out.println("Ingrese una letra: ");
        String letra = sc.nextLine();
        return frase.contains(letra);
    }
}
