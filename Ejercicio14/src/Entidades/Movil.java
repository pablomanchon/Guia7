package Entidades;

import java.util.Vector;

/*14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
        posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
        almacenar cada producto con su información. Crear una entidad Movil con los atributos
        marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
        un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
        correspondiente al código. A continuación, se implementarán los siguientes métodos:
         Un constructor por defecto.
         Un constructor con todos los atributos como parámetro.
         Métodos getters y setters de cada atributo.
         Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
        instanciar un objeto Celular y poder cargarlo en nuestro programa.
         Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
        números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
public class Movil {
    private String marca;
    private int precio;
    private String modelo;
    private String memoriaRam;
    private String almacenamiento;
    private Vector<Integer> codigo = new Vector<Integer>(7);

    public Movil() {
    }

    public Movil(String marca, int precio, String modelo, String memoriaRam, String almacenamiento, Vector<Integer> codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public Vector<Integer> getCodigo() {
        return codigo;
    }

    public void setCodigo(Vector<Integer> codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "\n________________________________" +
                "\nMovil: " +
                "\nmarca: '" + marca + '\'' +
                "\nprecio: $" + precio +
                "\nmodelo: '" + modelo + '\'' +
                "\nmemoriaRam: '" + memoriaRam + " Gb" +
                "\nalmacenamiento: '" + almacenamiento + "Gb" +
                "\ncodigo: " + codigo +
                "\n________________________________";
    }
}
