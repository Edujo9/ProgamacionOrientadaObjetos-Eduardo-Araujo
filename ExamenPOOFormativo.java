/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpooformativo;

import java.util.Scanner;

/** pregunta 3
 *
 * @author Eduardo
 */
public class ExamenPOOFormativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        double arreglo1[] = new double[10];
        double arreglo2[] = new double[10];
        double suma[]=new double[10], resta[]=new double[10], multiplicacion[]=new double[10], division[]=new double[10];
        try {
            
            for (int i = 0; i < arreglo1.length; i++) {
                System.out.println("Ingrese datos para el arreglo 1 en la posicion  "+(i+1));
                arreglo1[i]=n.nextDouble();
                }
                for (int j = 0; j < arreglo2.length; j++) {
                System.out.println("Ingrese datos para el arreglo 2 en la posicion "+(j+1));
                arreglo2[j]=n.nextDouble();
                }   
                for (int k = 0; k < suma.length; k++) {
                double valor1=0;
                    if (arreglo1.length>k) {
                        valor1=arreglo1[k];
                    }
                double valor2=0;    
                    if (arreglo2.length >k) {
                        valor2=arreglo2[k];
                    }
                    suma[k]=valor1+valor2;
                    System.out.println("\nLa suma de la posicion :"+(k+1)+" es "+suma[k]);
        }
                for (int l = 0; l < resta.length; l++) {
                double valor1=0;
                    if (arreglo1.length>l) {
                        valor1=arreglo1[l];
                    }
                double valor2=0;    
                    if (arreglo2.length >l) {
                        valor2=arreglo2[l];
                    }
                    resta[l]=valor1-valor2;
                    System.out.println("\nLa resta de la posicion :"+(l+1)+" es "+resta[l]);
        }
                for (int k = 0; k < multiplicacion.length; k++) {
                double valor1=0;
                    if (arreglo1.length>k) {
                        valor1=arreglo1[k];
                    }
                double valor2=0;    
                    if (arreglo2.length >k) {
                        valor2=arreglo2[k];
                    }
                    multiplicacion[k]=valor1*valor2;
                    System.out.println("\nLa multiplicacion de la posicion :"+(k+1)+" es "+multiplicacion[k]);
        }
                for (int k = 0; k < division.length; k++) {
                double valor1=0;
                    if (arreglo1.length>k) {
                        valor1=arreglo1[k];
                    }
                double valor2=0;    
                    if (arreglo2.length >k) {
                        valor2=arreglo2[k];
                    }
                    division[k]=valor1/valor2;
                    System.out.println("\nLa division de la posicion :"+(k+1)+" es "+division[k]);
        }
            
        } catch (Exception c) {
        }
    }
}

