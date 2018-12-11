/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpooformativo;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class FibonacciyFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //fibonacci
        try {
            Scanner entrada = new Scanner(System.in);
            int val, pre = 0, pos = 1;
            System.out.println("ingresar el numero de terminos a generar de la serie");
            int n = entrada.nextInt();
            System.out.println("comienzo de serie fibonacci");
            System.out.println(pre);
            System.out.println(pos);
            for (int i = 3; i <= n; i++) {
                val = pre + pos;
                pre = pos;
                pos = val;
                System.out.println(+val);
            }
            //factorial de un numero
            System.out.println("Y el Factorial de: "+n);
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("" + factorial);
        } catch (Exception c) {
        }
    }
}
