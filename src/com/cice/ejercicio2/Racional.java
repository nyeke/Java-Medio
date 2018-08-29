package com.cice.ejercicio2;

public class Racional {
    private int num;
    private int den;

    public Racional() {
    }

    public Racional(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    /** Suma dos numeros racionales
     * @param s
     * @return
     */
    public Racional sumar (Racional s){
        Racional aux = new Racional();
        aux.num = num * s.den + den * s.num;
        aux.den = den * s.den;
        return aux;
    }

    public Racional restar (Racional r){
        Racional aux = new Racional();
        aux.num = num * r.den + den * r.num;
        aux.den = den * r.den;
        return aux;
    }

    /** Multiplica dos numeros racionales
     * @param m
     * @return
     */
    public Racional multiplicar (Racional m){
        Racional aux = new Racional();
        aux.num = num * m.num;
        aux.den = den * m.num;
        return aux;
    }

    /** Divide dos numeros racionales
     * @param d
     * @return
     */
    public Racional dividir (Racional d){
        Racional aux = new Racional();
        aux.num = num * d.den;
        aux.den = den * d.num;
        return aux;
    }

    @Override
    public String toString(){
        return num + "/" + den;
    }
}
