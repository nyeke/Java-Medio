package com.cice.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double ancho;
        double alto;

        Scanner scan = new Scanner(System.in);

        System.out.println("Rectangulo1 - Introduzca las coordenadas x, y: ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        System.out.println("Introduzca ancho y alto: ");
        ancho = scan.nextDouble();
        alto = scan.nextDouble();
        Rectangulo rect1 = new Rectangulo(x, y, ancho, alto);

        System.out.println("Rectangulo2 - Introduzca ancho y alto: ");
        ancho = scan.nextDouble();
        alto = scan.nextDouble();
        Rectangulo rect2 = new Rectangulo(ancho, alto);

        System.out.println("Introduzca cuanto quiere desplazar x, y: ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        rect1.desplazar(x, y);
        rect2.desplazar(x,y);

        System.out.print("El rectangulo 1 ");
        rect1.mostrar();
        System.out.print("El rectangulo 2 ");
        rect2.mostrar();
    }
}
