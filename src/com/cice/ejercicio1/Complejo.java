package com.cice.ejercicio1;

import sun.plugin.com.event.COMEventHandler;

public class Complejo {
    private double real;
    private double imagin;

    public Complejo() {
    }

    public Complejo(double real, double imagin) {
        this.real = real;
        this.imagin = imagin;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagin() {
        return imagin;
    }

    public void setImagin(double imagin) {
        this.imagin = imagin;
    }

    /**Sumar dos numeros complejos
     *(a, b) + (c, d) = (a + c, b + d)
     * @param s
     * @return
     */
    public Complejo sumar (Complejo s){
        Complejo aux = new Complejo();
        aux.real = real + s.real;
        aux.imagin = imagin + s.imagin;
        return aux;
    }

    /**Restar dos numeros complejos
     * (a, b) - (c, d) = (a - c, b - d)
     * @param r
     * @return
     */
    public Complejo restar (Complejo r){
        Complejo aux =  new Complejo();
        aux.real = real - r.real;
        aux.imagin = imagin - r.imagin;
        return aux;
    }

    /**Multiplicar dos numeros complejos
     * (a, b) * (c, d) = (a*c – b*d, a*d + b*c)
     * @param m
     * @return
     */
    public Complejo multiplicar (Complejo m){
        Complejo aux = new Complejo();
        aux.real = real * m.real - imagin * m.imagin;
        aux.imagin = real * m.imagin + imagin + m.real;
        return aux;
    }

    /**Dividir dos numeros complejos
     * (a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
     * @param d
     * @return
     */
    public Complejo dividir (Complejo d){
        Complejo aux = new Complejo();
        aux.real = (real * d.real + imagin * d.imagin)/(d.real * d.real + d.imagin * d.imagin);
        aux.imagin = (imagin + d.real - real * d.imagin)/(d.real * d.real + d.imagin * d.imagin);
        return aux;
    }

    @Override
    public String toString(){
        return "(" + real + "," + imagin + ")";
    }

}
