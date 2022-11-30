package Main;

import Entidades.Persona;
import Servicios.Metodos;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Metodos m = new Metodos();
        persona = m.crearPersona(persona);
        persona = m.calcularEdad(persona);
        System.out.println(m.menorQue(persona.getEdad()));
        m.mostrarPersona(persona);
    }
}