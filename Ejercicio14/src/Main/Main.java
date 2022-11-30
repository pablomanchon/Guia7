package Main;

import Entidades.Movil;
import Servicios.Metodos;

import javax.swing.*;
import java.util.Vector;

public class Main {
    private JTextPane marca;
    private JTextPane modelo;
    private JTextPane RAM;
    private JTextPane almacenamiento;
    private JTextPane precio;
    private JPanel panel;

    public static void main(String[] args) {
       /* JFrame frame = new JFrame("Celulares");
        frame.setContentPane(new Main().panel);
        frame.setVisible(true);*/
        Metodos m = new Metodos();
        Vector<Movil> celulares = new Vector<Movil>(3);
        for (int i = 0; i < 3; i++) {
            Movil celu = new Movil();
            celu = m.cargarCelular(celu);
            celulares.add(celu);
        }
        System.out.println(celulares);
    }
}