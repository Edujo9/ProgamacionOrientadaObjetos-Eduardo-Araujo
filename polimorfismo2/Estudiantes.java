/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo2;

/**
 *
 * @author Eduardo
 */

public class Estudiantes {
private String nombre1;
private String nombre2;
private String nombre3;
private String nombre4;
private String uni;
private String ci;
private String carr;
private double nota1;
private double nota2;
private double nota3;
double n1;
double n2;
double n3;
double sum;
double pro;

public Estudiantes(String nombrea,String nombreb,String nombrec,String nombred,String uni1,String carrera,String ci1,double nota1a,double nota2a,double nota3a){
nombre1=nombrea;
nombre2=nombreb;
nombre3=nombrec;
nombre4=nombred;
uni=uni1;
carr=carrera;
ci=ci1;
nota1=nota1a;
nota2=nota2a;
nota3=nota3a;
n1=nota1;
n2=nota2;
n3=nota3;
sum=n1+n2+n3;
pro=(n1+n2+n3)/3;
System.out.printf("Estudiante: %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s \n ",nombre1,nombre2,nombre3,nombre4,"de la universidad",uni,"de la carrera",carr,"que se encuentra en el ciclo",ci,"nota evaluacion diagnostica:",nota1,"nota evaluacion formativa:",nota2,"nota evaluacion sumativa",nota3,"nota total",sum,"nota promediada",pro);
}
public String obtenernombre1(){
    return nombre1;
}
public String obtenernombre2(){
    return nombre1;
}
public String obtenernombre3(){
    return nombre1;
}
public String obtenernombre4(){
    return nombre1;
}
public String obtenerci(){
    return ci;
}
public String obtenercarr(){
    return carr;
}

public String obteneruni(){
    return uni;
}
public double obtenernota1(){
    return nota1;
}
public double obtenernota2(){
    return nota2;
}
public double obtenernota3(){
    return nota3;
}
}


