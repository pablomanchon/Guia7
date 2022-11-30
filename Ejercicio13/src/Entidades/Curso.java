package Entidades;

import java.util.List;
import java.util.Vector;

/*13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
        programa para organizar la información de cada curso. Para ello, crearemos una clase
        entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
        cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
        alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
        nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
         Un constructor por defecto.
         Un constructor con todos los atributos como parámetro.
         Métodos getters y setters de cada atributo.
         método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
        que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
        en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
        nombre de cada alumno.
         Método crearCurso(): el método crear curso, le pide los valores de los atributos al
        usuario y después se le asignan a sus respectivos atributos para llenar el objeto
        Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
        al atributo alumnos
         Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
        en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
        día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
        se repite el encuentro. horasxdia * precioHora * cantidad de alumnos * diasxsemana*/
public class Curso {
    private String nombreCurso;
    private String turno;
    private Integer cantidadHorasPorDia;
    private Integer cantidadDiasPorSemana;
    private Integer precioPorHora;
    private Integer gananciaSemanal;
    private Vector<String> alumnos = new Vector<>(5);

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, Integer cantidadHorasPorDia, Integer cantidadDiasPorSemana, Integer precioPorHora, Integer gananciaSemanal, Vector<String> alumnos) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.precioPorHora = precioPorHora;
        this.gananciaSemanal = gananciaSemanal;
        this.alumnos = alumnos;
    }


    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(Integer cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public Integer getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(Integer cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public Integer getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Integer precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public Integer getGananciaSemanal() {
        return gananciaSemanal;
    }

    public void setGananciaSemanal(Integer gananciaSemanal) {
        this.gananciaSemanal = gananciaSemanal;
    }

    public Vector<String> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Vector<String> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso:" +
                "\nnombreCurso: '" + nombreCurso + '\'' +
                "\nturno: '" + turno + '\'' +
                "\ncantidadHorasPorDia: " + cantidadHorasPorDia + " Horas" +
                "\ncantidadDiasPorSemana: " + cantidadDiasPorSemana + " Dias" +
                "\nprecioPorHora: $" + precioPorHora +
                "\ngananciaSemanal: $" + gananciaSemanal +
                "\nalumnos: " + alumnos;
    }
}
