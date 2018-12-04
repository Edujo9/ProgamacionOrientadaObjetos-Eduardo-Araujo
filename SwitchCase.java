/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int opcion= cuadropincipal();
            
            if (opcion >7) {
                JOptionPane.showMessageDialog(null,"Ingrese solo los numeros de las opciones" );                
                cuadropincipal();
            }
            
            switch (opcion) {
                case 1:
                    float n1,n2,suma;
                    JOptionPane.showMessageDialog(null,"Ha escogido la Opcion SUMA" );
                    n1=  Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el primer numero") );
                    n2=  Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el segundo numero" ));
                    suma= n1+n2;
                    JOptionPane.showMessageDialog(null,"la suma es:" +suma);
                    cuadropincipal();
                                       
                case 2:
                    float n3,n4,multi;
                    JOptionPane.showMessageDialog(null,"Ha escogido la opcion Multiplicacion" );  
                    n1=  Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el primer numero") );
                    n2=  Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el segundo numero" ));
                    multi= n1*n2;
                    JOptionPane.showMessageDialog(null,"el producto es:" +multi);
                    cuadropincipal();
                    
                case 3:
                    int n6, factorial=1;
                    JOptionPane.showMessageDialog(null,"Ha escogido la opcion Factorial d un numero" );  
                    n6=  Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero del cual desesa calcular su factorial") );
                    for (int i = 1; i <= n6; i++) {
                        factorial *= i;                                               
                    }
                    JOptionPane.showMessageDialog(null,"el factorial es "+factorial);
                    cuadropincipal();
                    
                case 4:
                    double n7,raiz;
                    JOptionPane.showMessageDialog(null,"Ha escogido la opcion Raiz cuadrada" );  
                    n7=  Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero del cual desesa calcular su raiz cuadrada") );
                    raiz= Math.sqrt(n7);
                    JOptionPane.showMessageDialog(null,"la riz cuadrada es"+raiz);
                    cuadropincipal();
                    
                case 5:
                    double n8,sin;
                    JOptionPane.showMessageDialog(null,"Ha escogido la opcion Seno de un Angulo" );  
                    n8=  Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero del cual desesa calcular su seno") ); 
                    n8= Math.toDegrees(n8);
                    sin=Math.sin(n8);
                    JOptionPane.showMessageDialog(null,"el seno es"+sin);
                    cuadropincipal();
                     
                    
                case 6:
                    double n9,cos;
                    JOptionPane.showMessageDialog(null,"Ha escogido la opcion Coseno de un Angulo " );  
                    n9=  Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero del cual desesa calcular su coseno") ); 
                    n9= Math.toDegrees(n9);
                    cos=Math.cos(n9);
                    JOptionPane.showMessageDialog(null,"el coseno es"+cos);
                    cuadropincipal();
                    
                case 7:
                    double n10,tan;
                    JOptionPane.showMessageDialog(null,"Ha escogido la opcion Tangente de un Angulo" );  
                    n10=  Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero del cual desesa calcular su tagente") ); 
                    n10= Math.toDegrees(n10);
                    tan=Math.tan(n10);
                    JOptionPane.showMessageDialog(null,"la tangente es"+tan);
                    cuadropincipal();
                   
                                       
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El valor Escoja un valor numerico: indicado en las selecciones");
        }

    }

    private static int cuadropincipal() {
        JOptionPane.showMessageDialog(null, "Los valores a escoger son \n 1:suma \n 2:multiplicacion "
                    + "\n 3:Factorial \n 4:Raiz Cuadrada \n 5:Sin \n 6:Cos \n 7:Tan  ");
            int opcion;
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            return opcion;
    } 
}
