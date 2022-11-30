package Main;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(1997, 11, 24);
        LocalDate fechaActual;
        ZoneId zona;
        long edad = ChronoUnit.YEARS.between(fecha, LocalDate.now());
        System.out.println(edad);
        System.out.println(LocalDate.now());

    }
}