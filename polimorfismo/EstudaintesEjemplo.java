/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class EstudaintesEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("Determine el numero de estudiantes");
            int x1 = new Scanner(System.in).nextInt();
            for (int i = 1; i <= x1; i++) {
                System.out.println(Estudiante.obtenernes());
                System.out.println("Ingrese sus datos: Primer nombre\n Segundo nombre\n Primer apellido\n Segundo apellido \n nota diagnostica \n nota formativa \n nota sumativa \n================================");
                String x = new Scanner(System.in).next();
                String x2 = new Scanner(System.in).next();
                String x3 = new Scanner(System.in).next();
                String x4 = new Scanner(System.in).next();

                double x5 = new Scanner(System.in).nextDouble();
                double x6 = new Scanner(System.in).nextDouble();
                double x7 = new Scanner(System.in).nextDouble();

                Estudiante ob1 = new Estudiante(x, x2, x3, x4, x5, x6, x7);

            }
        } catch (Exception e) {
            System.out.println("Valor mal ingresado");
            System.out.println("====================================================================");
            System.out.println("Determine el numero de estudiantes");
            int x1 = new Scanner(System.in).nextInt();
            for (int i = 1; i <= x1; i++) {
                System.out.println(Estudiante.obtenernes());
                System.out.println("Ingrese sus datos: Primer nombre\n Segundo nombre\n Primer apellido\n Segundo apellido \n nota diagnostica \n nota formativa \n nota sumativa \n================================");
                String x = new Scanner(System.in).next();
                String x2 = new Scanner(System.in).next();
                String x3 = new Scanner(System.in).next();
                String x4 = new Scanner(System.in).next();

                double x5 = new Scanner(System.in).nextDouble();
                double x6 = new Scanner(System.in).nextDouble();
                double x7 = new Scanner(System.in).nextDouble();

                Estudiante ob1 = new Estudiante(x, x2, x3, x4, x5, x6, x7);
            }

        }
    }
}
