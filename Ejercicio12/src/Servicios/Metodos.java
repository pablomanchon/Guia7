package Servicios;

import Entidades.Persona;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public Persona crearPersona(Persona persona) {
        int dia, mes, anio;

        System.out.println("Nombre completo: ");
        persona.setNombre(sc.nextLine());

        System.out.println("Fecha de nacimiento (Día, Mes, Año): ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();
        LocalDate fechaNac = LocalDate.of(anio, mes, dia);
        persona.setFechaNacimiento(fechaNac);

        return persona;
    }

    public Persona calcularEdad(Persona persona) {
        long edad = ChronoUnit.YEARS.between(persona.getFechaNacimiento(), LocalDate.now());
        persona.setEdad(edad);
        return persona;
    }

    public boolean menorQue(long edad) {
        System.out.println("Ingrese una edad a comparar: ");
        long comparacion = sc.nextLong();
        return comparacion < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println(persona);
    }
}
