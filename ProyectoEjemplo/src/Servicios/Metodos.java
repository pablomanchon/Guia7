package Servicios;

import Entidades.Taza;

public class Metodos {
       Taza t1 = new Taza();
   public Taza crearTaza() {
       t1.tamanio = "Grande";       //* Público
       t1.volumen = 400;            //* Público
       t1.setColor("Celeste");      //Privado
       t1.setMaterial("Vidrio");    //Privado
       return t1;
   }



    public void imprimirTaza() {
       System.out.println(t1);
   }
}
