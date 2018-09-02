package com.cice.ejercicio4;

public class Linea {
    Punto p1 = new Punto();
    Punto p2 = new Punto();

    public Linea() {
        this.p1.setX(0);
        this.p1.setY(0);
        this.p2.setX(0);
        this.p2.setY(0);
    }

    public Linea(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void mueveDerecha(double n){
        this.p1.setX(p1.getX()+n);
        this.p2.setX(p2.getX()+n);
    }

    public void mueveIzquierda(double n){
        this.p1.setX(p1.getX()-n);
        this.p2.setX(p2.getX()-n);
    }

    public void mueveArriba(double n){
        this.p1.setY(p1.getY()+n);
        this.p2.setY(p2.getY()+n);
    }

    public void mueveAbajo(double n){
        this.p1.setY(p1.getY()-n);
        this.p2.setY(p2.getY()-n);
    }

    public void mostrar(){
        System.out.println("[" + this.p1 + "," + this.p2 + "]");
    }

}
