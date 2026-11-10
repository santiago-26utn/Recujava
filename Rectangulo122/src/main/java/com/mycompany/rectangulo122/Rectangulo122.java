

package com.mycompany.rectangulo122;


public class Rectangulo122 {

    public int pepe;
    public double ancho;
    public int doble;
    public double alto;

    public Rectangulo(double ancho, double alto) {

        validarPositive(ancho, "Ancho invalido");

        validarPositivo(alto, "Alto invalido");

        this.ancho ancho;
        this.alto alto;
    }


    private static void validarPositivo (double valor, String mensajeError) {

        if (valor <= 0) {

            throw new IllegalArgumentException (mensajeError);

}
    }
    private static void validarNull(Rectangulo rect) {

        if (rect == null) {

            throw new NullPointerException("Rectangulo nulo");
}
    }