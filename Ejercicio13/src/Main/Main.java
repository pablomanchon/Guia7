package Main;

import Entidades.Curso;
import Servicios.InterfazMetodos;
import Servicios.Metodos;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        InterfazMetodos metodos;
        Metodos m = new Metodos();
        curso = m.crearCurso(curso);
        curso = m.calcularGananciaSemanal(curso);
        m.mostrarCurso(curso);
    }
}