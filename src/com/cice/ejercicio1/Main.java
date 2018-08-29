package com.cice.ejercicio1;

public class Main {
    public static void main(String[] args) {

        Complejo c1 = new Complejo(1.0,2.0);
        Complejo c2 = new Complejo(3.0, 4.0);
        Complejo resultado;

        //suma
        resultado = c1.sumar(c2);
        System.out.println(c1 + " + " + c2 + " = " + resultado);

        //resta
        resultado = c1.restar(c2);
        System.out.println(c1 + " - " + c2 + " = " + resultado);

        //multiplicacion
        resultado = c1.multiplicar(c2);
        System.out.println(c1 + " * " + c2 + " = " + resultado);

        //division
        resultado = c1.dividir(c2);
        System.out.println(c1 + " / " + c2 + " = " + resultado);

    }
}
