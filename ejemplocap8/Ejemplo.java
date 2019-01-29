/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocap8;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Determine el numero de estudiantes");
        int x1=new Scanner(System.in).nextInt();
        for (int i = 1; i <= x1; i++) {  
        System.out.println(Estudiante.obtenerID());
        System.out.println("Ingrese sus datos: Primer nombre, Segundo nombre, Primer apellido,Segundo apellido y numero de cedula");
        String x=new Scanner(System.in).next();
        String x2=new Scanner(System.in).next();
        String x3=new Scanner(System.in).next();
        String x4=new Scanner(System.in).next();
        String x5=new Scanner(System.in).next(); 
        String x6=new Scanner(System.in).next();
        Estudiante e1=new Estudiante(x,x2,x3,x4,x5,x6);
        }
    }
    
    
}
