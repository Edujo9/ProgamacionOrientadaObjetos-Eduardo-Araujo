/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdpoo;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class PDPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un numero");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Ingrese otro numero");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("======================");
        double s = a + b;
        System.out.println("La suma de" +" "+ a +" "+ "y" +" "+ b +" "+ "es \n" + s);
        System.out.println("======================");
        double r = a - b;
        System.out.println("La resta de" +" "+ a +" "+ "y" +" "+ b +" "+ "es \n" + r);
        System.out.println("======================");
        double m = a * b;
        System.out.println("La multiplicacion de" +" "+ a +" "+ "y" +" "+ b +" "+ "es \n" + m);
        System.out.println("======================");
        double d = a / b;
        System.out.println("La division de" +" "+ a +" "+ "y" +" "+ b +" "+ "es \n" + d);
        System.out.println("======================");
        if (s >= 0) {
            double rs = Math.sqrt(s);
            System.out.println("la raiz cuadrada de la suma entre" +" "+ a +" "+ "y" +" "+ b +" "+ "es igual a\n" + rs);
            if (rs % 2 == 0) {
                System.out.println("El resultado es par");
            } else {
                int contador = 0;
                for (int i = 1; i <= m; i++) {
                    if (rs % i == 0) {

                    }
                }
                contador++;

                if (contador <= 2) {
                    System.out.println("el numero es primo");
                }
            }

        } else {
            System.out.println("La suma de" +" "+ a +" "+ "y" +" "+ b +" "+ "no tiene raiz cuadrada por que el resultado es negativo ");
        }
        System.out.println("======================");
        if (r >= 0) {
            double rr = Math.sqrt(r);
            System.out.println("la raiz cuadrada de la resta entre" +" "+ a +" "+ "y" +" "+ b +" "+ "es igual a\n" + rr);
            if (rr % 2 == 0) {
                System.out.println("El resultado es par");
            } else {
                int contador = 0;
                for (int i = 1; i <= m; i++) {
                    if (rr % i == 0) {

                    }
                }
                contador++;

                if (contador <= 2) {
                    System.out.println("el numero es primo");
                }

            }

        } else {
            System.out.println("La resta de" +" "+ a +" "+ "y" +" "+ b +""+ "no tiene raiz cuadrada por que es negativa");
        }
        System.out.println("======================");
        if (m >= 0) {
            double rm = Math.sqrt(m);
            System.out.println("la raiz cuadrada de la multiplicacion entre" +" "+ a +" "+ "y" +" "+ b +" "+ "es igual a\n" + rm);
            if (rm % 2 == 0) {
                System.out.println("El resultado es par");
            } else {
                int contador = 0;
                for (int i = 1; i <= m; i++) {
                    if (rm % i == 0) {

                    }
                }
                contador++;

                if (contador <= 2) {
                    System.out.println("el numero es primo");
                }

            }

        } else {
            System.out.println("La multiplicacion de"+" "+ a +" "+ "y"+" "+ b +" "+ "no tiene raiz cuadrada por que es negativa ");

        }
        System.out.println("======================");
        if (d >= 0) {
            double rd = Math.sqrt(d);
            System.out.println("la raiz cuadrada de la division entre"+" "+ a +" "+ "y"+" " + b + " "+ "es igual a\n" + rd);
            if (rd % 2 == 0) {
                System.out.println("El resultado es par");
            } else {
                int contador = 0;
                for (int i = 1; i <= m; i++) {
                    if (rd % i == 0) {

                    }
                }
                contador++;

                if (contador <= 2) {
                    System.out.println("el numero es primo");
                }
            }
        } else {
            System.out.println("La division de"+" " + a +" "+ "y"+ " " + b + "no tiene raiz cuadrada por que la division es negativa");

        }
    }
}
    

