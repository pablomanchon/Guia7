package Servicios;

import Entidades.Curso;

import java.util.*;

public class Metodos implements InterfazMetodos {
    Scanner sc = new Scanner(System.in);

    public Curso cargarAlumnos(Curso curso) {
        Vector<String> alumnos = new Vector<>(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del " + (i + 1) + "° Alumno: ");
            alumnos.add(sc.nextLine());
        }
        curso.setAlumnos(alumnos);
        return curso;
    }

    public Curso crearCurso(Curso curso) {
        System.out.print("Nombre del curso: ");
        curso.setNombreCurso(sc.nextLine());

        System.out.print("Turno (Mañana o Tarde): ");
        curso.setTurno(sc.nextLine());

        System.out.print("Horas por dia: ");
        curso.setCantidadHorasPorDia(sc.nextInt());

        System.out.print("Dias por semana: ");
        curso.setCantidadDiasPorSemana(sc.nextInt());

        System.out.print("Precio por hora: ");
        curso.setPrecioPorHora(sc.nextInt());

        sc.nextLine();

        curso = cargarAlumnos(curso);

        return curso;
    }

    public Curso calcularGananciaSemanal(Curso curso) {
        Integer horas = curso.getCantidadHorasPorDia();
        Integer dias = curso.getCantidadDiasPorSemana();
        Integer precio = curso.getPrecioPorHora();
        Integer cantAlumnos = curso.getAlumnos().size();
        curso.setGananciaSemanal(horas * dias * precio * cantAlumnos);
        return curso;
    }

    public void mostrarCurso(Curso curso) {
        System.out.println(curso);
    }

}
