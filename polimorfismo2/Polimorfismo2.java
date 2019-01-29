/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//3 estudiantes
//nombres y apellidos
//universidad
//carrera
//ciclo
//nota diagnostica
//nota formativa
//nota sumativa
//sumatoria
//promedio 
package polimorfismo2;

/**
 *
 * @author Eduardo
 */
public class Polimorfismo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Estudiantes obj= new Estudiantes("Eduardo","José","Araujo","Abad","UIDE","Informatica y multimedia","3er",20,30,40);
    System.out.println(obj); 
    Estudiantes obj1= new Estudiantes("Wilson","Eduardo","Armijos","Cango","UIDE","Informatica y multimedia","3er",15,25,35);
    System.out.println(obj1); 
    Estudiantes obj2= new Estudiantes("Darwin","Andrés","Tandazo","####","UIDE","Informatica y multimedia","5to",25,25,20);
    System.out.println(obj2); 
    }
    
    
}
