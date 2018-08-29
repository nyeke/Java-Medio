package com.cice.ejercicio2;

import java.util.RandomAccess;

public class Main {
    public static void main(String[] args) {
        Racional r1 = new Racional(1,4);
        Racional r2 = new Racional(1,2);
        Racional resultado;

        //suma
        resultado = r1.sumar(r2);
        System.out.println(r1 + " + " + r2 + " = " + resultado);

        //resta
        resultado = r1.restar(r2);
        System.out.println(r1 + " - " + r2 + " = " + resultado);

        //multiplicar
        resultado = r1.multiplicar(r2);
        System.out.println(r1 + " * " + r2 + " = " + resultado);

        //dividir
        resultado = r1.dividir(r2);
        System.out.println(r1 + " / " + r2 + " = " + resultado);
    }
}
