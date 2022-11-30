package Servicios;

import Entidades.Curso;

public interface InterfazMetodos {
    public Curso cargarAlumnos(Curso curso);
    public Curso crearCurso(Curso curso);
    public Curso calcularGananciaSemanal(Curso curso);
    public void mostrarCurso(Curso curso);
}
