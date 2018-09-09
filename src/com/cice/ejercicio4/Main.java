package com.cice.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        int menu;
        double aux =  0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer punto: ");
        aux = sc.nextDouble();
        p1.setX(aux);
        p1.setY(sc.nextDouble());

        System.out.println("Introduzca el segundo punto: ");
        p2.setX(sc.nextDouble());
        p2.setY(sc.nextDouble());

        Linea l1 = new Linea(p1,p2);

        System.out.println("==== Donde quiere desplazar ====");
        System.out.println("1. Derecha");
        System.out.println("2. Izquierda");
        System.out.println("3. Arriba");
        System.out.println("4. Abajo");
        System.out.println("===============================");
        menu = sc.nextInt();
        System.out.println("Cuanto quiere desplazar: ");
        aux = sc.nextDouble();

        switch (menu){
            case 1:
                l1.mueveDerecha(aux);
                break;
            case 2:
                l1.mueveDerecha(aux);
                break;
            case 3:
                l1.mueveDerecha(aux);
                break;
            case 4:
                l1.mueveDerecha(aux);
                break;
            default:
                System.out.println("Opcion no valida");
        }

        l1.mostrar();

    }
}
