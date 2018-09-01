package com.cice.ejercicio3;

public class Rectangulo {

    private double x;
    private double y;
    private double ancho;
    private double alto;

    public Rectangulo() {
        this.x = 0;
        this.y = 0;
        this.ancho = 1;
        this.alto = 1;
    }

    public Rectangulo(double ancho, double alto) {
        this.x = 0;
        this.y = 0;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(double x, double y, double ancho, double alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    /**
     * Devuelve el area del triangulo
     * @return
     */
    public double superficie(){
        return ancho*alto;
    }

    /**
     * Desplaza el triangulo segun los parametros introducidos
     * @param x1
     * @param y1
     */
    public void desplazar(double x1, double y1){
        x+=x1;
        y+=y1;
        ancho+=x1;
        alto+=y1;
    }

    /**
     * Muestra la posicion del triangulo
     */
    public void mostrar(){
        System.out.println("comienza en " + x + " , " + y + " y acaba en " + ancho + " , " + alto);
    }
}
