/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Eduardo
 */
public class Estudiante {

    private String Primernombre;
    private String SegundoNombre;
    private String Primerapellido;
    private String Segundoapellido;
    private double nota1 = 0;
    private double nota2 = 0;
    private double nota3 = 0;
    private static int nes = 0;
    private double total=0;
    double contador = 0;
    double contador1 = 0;
    double contador2= 0;
    double suma=0;
    public Estudiante(String nombre1, String nombre2, String apellido1, String apellido2, double notaa, double notab, double notac) {
            
        Primernombre = nombre1;
        SegundoNombre = nombre2;
        Primerapellido = apellido1;
        Segundoapellido = apellido2;
        nota1 = notaa;
        nota2 = notab;
        nota3 = notac;
        contador=nota1;
        contador1=nota2;
        contador2=nota3;
        suma=contador+contador1+contador2;
        
        nes++;
        
        System.out.printf("Estudiante:%s %s %s %s %s %s %s %s %s %s %s %s ;", Primernombre, SegundoNombre, Primerapellido, Segundoapellido, "nota de evaluacion diagnostica:", nota1, "nota de evaluacion formativa:", nota2, "nota de evaluacion sumativa", nota3,"total:",suma);
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

    public double obtenernota1() {
        return nota1;
    }

    public double obtenernota2() {
        return nota2;
    }

    public double obtenernota3() {
        return nota3;
    }

    public static int obtenernes() {
        return nes;
    }
    public double obtenertotal(){
        total= obtenernota1()+obtenernota2()+obtenernota3();
               return total;
    }
        
    
   
}

