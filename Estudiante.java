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

public class Estudiante {
     private String Primernombre;
            private String SegundoNombre;
            private String Primerapellido;
            private String Segundoapellido;
            private String Numerocedula;
            private String Carrera;
            private static int ID=0;
        
            public Estudiante(String nombre1, String nombre2, String apellido1, String apellido2,String ced1,String carrera) {

                Primernombre = nombre1;
                SegundoNombre = nombre2;
                Primerapellido = apellido1;
                Segundoapellido = apellido2;
                Numerocedula=ced1;
                ID++;
                Carrera=carrera;
                System.out.printf("Constructor Estudiante: %s %s %s %s %s %s ;ID=%d %s %s \n", Primernombre, SegundoNombre, Primerapellido, Segundoapellido, "numero de cedula:", Numerocedula,ID,"estudiante de la carrera:",Carrera);
            
            }
            public String obtenerPrimernombre() {
                return Primernombre;
            }

            public String obtenerSegundoNombre() {
                return SegundoNombre;
            }

            public String obtenerPrimerapellido() {
                return Primerapellido;
            }

            public String obtenerSegundoapellido() {
                return Segundoapellido;
            }

            public String obtenerCedula() {
                return Numerocedula;
            }
            public String Obtenercarrera(){
                return Carrera;
            }
            public static int obtenerID(){
                return ID;
            }
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Determine el numero de estudiantes");
        int x1=new Scanner(System.in).nextInt();
        for (int i = 1; i <= x1; i++) {  
        System.out.println(Estudiante.obtenerID());
        System.out.println("Ingrese sus datos: Primer nombre\n Segundo nombre\n Primer apellido\n Segundo apellido \n numero de cedula \n carrera \n================================");
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
    