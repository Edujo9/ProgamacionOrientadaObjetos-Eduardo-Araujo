/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Eduardo Araujo 27/11/2018
 */
public class Maximoentrevariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            double factorial = 1;
            System.out.println("ingrese 1 numero");
            double a = new Scanner(System.in).nextDouble();
            System.out.println("ingrese 1 numero");
            double b = new Scanner(System.in).nextDouble();
            System.out.println("ingrese 1 numero");
            double c = new Scanner(System.in).nextDouble();
            System.out.println("ingrese 1 numero");
            double d = new Scanner(System.in).nextDouble();
            System.out.println("ingrese 1 numero");
            double e = new Scanner(System.in).nextDouble();
            if (a > b && a > c && a > d && a > e) {
                System.out.println("el numero mayor es:" + "" + a);
                double x = Math.sqrt(a);
                System.out.println("La raiz cuadrada del valor maximo es:" + "" + x);
            } else {
                if (b > a && b > c && b > d && b > e) {
                    System.out.println("el numero mayor es:" + "" + b);
                    double x = Math.sqrt(b);
                    System.out.println("La raiz cuadrada del valor maximo es:" + "" + x);
                    if (a < b && a < c && a < d && a < e) {
                        System.out.println("el numero menor es:" + "" + a);
                        double w = x + a;
                        for (int i = 1; i <= w; i++) {
                            factorial *= i;
                        }
                        System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                        System.out.println("el factorial de la suma es" + "" + factorial);
                        if (w % 2 == 0) {
                            System.out.println("La suma es par");
                        } else {
                            if (w % 2 != 0) {
                                System.out.println("la suma es impar");
                            }
                        }
                    } else {
                        if (b < a && b < c && b < d && b < e) {
                            System.out.println("el numero menor es:" + "" + b);
                            double w = x + b;
                            for (int i = 1; i <= w; i++) {
                                factorial *= i;
                            }
                            System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                            System.out.println("el factorial de la suma es" + "" + factorial);
                            if (w % 2 == 0) {
                                System.out.println("La suma es par");
                            } else {
                                if (w % 2 != 0) {
                                    System.out.println("la suma es impar");
                                }
                            }
                        } else {
                            if (c < a && c < b && c < d && c < e) {
                                System.out.println("El numero menor es:" + "" + c);
                                double w = x + c;
                                for (int i = 1; i <= w; i++) {
                                    factorial *= i;
                                }
                                System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                System.out.println("el factorial de la suma es" + "" + factorial);
                                if (w % 2 == 0) {
                                    System.out.println("La suma es par");
                                } else {
                                    if (w % 2 != 0) {
                                        System.out.println("la suma es impar");
                                    }
                                }
                            } else if (d < a && d < b && d < c && d < e) {
                                System.out.println("el numero menor es:" + "" + d);
                                double w = x + d;
                                for (int i = 1; i <= w; i++) {
                                    factorial *= i;
                                }
                                System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                System.out.println("el factorial de la suma es" + "" + factorial);
                                if (w % 2 == 0) {
                                    System.out.println("La suma es par");
                                } else {
                                    if (w % 2 != 0) {
                                        System.out.println("la suma es impar");
                                    }                                   
                                }
                            } else if (e < a && e < b && e < c && e < d) {
                                System.out.println("el numero menor es:" + "" + e);
                                double w = x + e;
                                for (int i = 1; i <= w; i++) {
                                    factorial *= i;
                                }
                                System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                System.out.println("el factorial de la suma es" + "" + factorial);
                                if (w % 2 == 0) {
                                    System.out.println("La suma es par");
                                } else {
                                    if (w % 2 != 0) {
                                        System.out.println("la suma es impar");
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (c > a && c > b && c > d && c > e) {
                        System.out.println("El numero mayor es:" + "" + c);
                        double x = Math.sqrt(c);
                        System.out.println("La raiz cuadrada del valor maximo es:" + "" + x);
                        if (a < b && a < c && a < d && a < e) {
                            System.out.println("el numero menor es:" + "" + a);
                            double w = x + a;
                            for (int i = 1; i <= w; i++) {
                                factorial *= i;
                            }
                            System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                            System.out.println("el factorial de la suma es" + "" + factorial);
                            if (w % 2 == 0) {
                                System.out.println("La suma es par");
                            } else {
                                if (w % 2 != 0) {
                                    System.out.println("la suma es impar");
                                }
                            }
                        } else {
                            if (b < a && b < c && b < d && b < e) {
                                System.out.println("el numero menor es:" + "" + b);
                                double w = x + b;
                                for (int i = 1; i <= w; i++) {
                                    factorial *= i;
                                }
                                System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                System.out.println("el factorial de la suma es" + "" + factorial);
                                if (w % 2 == 0) {
                                    System.out.println("La suma es par");
                                } else {
                                    if (w % 2 != 0) {
                                        System.out.println("la suma es impar");
                                    }
                                }
                            } else {
                                if (c < a && c < b && c < d && c < e) {
                                    System.out.println("El numero menor es:" + "" + c);
                                    double w = x + c;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                } else if (d < a && d < b && d < c && d < e) {
                                    System.out.println("el numero menor es:" + "" + d);
                                    double w = x + d;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("" + factorial);
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                } else if (e < a && e < b && e < c && e < d) {
                                    System.out.println("el numero menor es:" + "" + e);
                                    double w = x + e;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                }
                            }
                        }
                    } else if (d > a && d > b && d > c && d > e) {
                        System.out.println("el numero mayor es:" + "" + d);
                        double x = Math.sqrt(d);
                        System.out.println("La raiz cuadrada del valor maximo es:" + "" + x);
                        if (a < b && a < c && a < d && a < e) {
                            System.out.println("el numero menor es:" + "" + a);
                            double w = x + a;
                            for (int i = 1; i <= w; i++) {
                                factorial *= i;
                            }
                            System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                            System.out.println("el factorial de la suma es" + "" + factorial);
                            if (w % 2 == 0) {
                                System.out.println("La suma es par");
                            } else {
                                if (w % 2 != 0) {
                                    System.out.println("la suma es impar");
                                }
                            }
                        } else {
                            if (b < a && b < c && b < d && b < e) {
                                System.out.println("el numero menor es:" + "" + b);
                                double w = x + b;
                                for (int i = 1; i <= w; i++) {
                                    factorial *= i;
                                }
                                System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                System.out.println("el factorial de la suma es" + "" + factorial);
                                if (w % 2 == 0) {
                                    System.out.println("La suma es par");
                                } else {
                                    if (w % 2 != 0) {
                                        System.out.println("la suma es impar");
                                    }
                                }
                            } else {
                                if (c < a && c < b && c < d && c < e) {
                                    System.out.println("El numero menor es:" + "" + c);
                                    double w = x + c;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                } else if (d < a && d < b && d < c && d < e) {
                                    System.out.println("el numero menor es:" + "" + d);
                                    double w = x + d;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                } else if (e < a && e < b && e < c && e < d) {
                                    System.out.println("el numero menor es:" + "" + e);
                                    double w = x + e;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                }
                            }
                        }
                    } else if (e > a && e > b && e > c && e > d) {
                        System.out.println("el numero mayor es:" + "" + e);
                        double x = Math.sqrt(e);
                        System.out.println("La raiz cuadrada del valor maximo es:" + "" + x);
                        if (a < b && a < c && a < d && a < e) {
                            System.out.println("el numero menor es:" + "" + a);
                            double w = x + a;
                            for (int i = 1; i <= w; i++) {
                                factorial *= i;
                            }                          
                            System.out.println("La suma del numero menor con la raiz del mayor es" + "" + w);
                            System.out.println("el factorial de la suma es" + "" + factorial);
                            if (w % 2 == 0) {
                                System.out.println("La suma es par");
                            } else {
                                if (w % 2 != 0) {
                                    System.out.println("la suma es impar");
                                }
                            }
                        } else {
                            if (b < a && b < c && b < d && b < e) {
                                System.out.println("el numero menor es:" + "" + b);
                                double w = x + b;
                                for (int i = 1; i <= w; i++) {
                                    factorial *= i;
                                }
                                System.out.println("La suma del numero menor con la raiz del mayor es" + " " + w);
                                System.out.println("el factorial de la suma es" + "" + factorial);
                                if (w % 2 == 0) {
                                    System.out.println("La suma es par");
                                } else {
                                    if (w % 2 != 0) {
                                        System.out.println("la suma es impar");
                                    }
                                }
                            } else {
                                if (c < a && c < b && c < d && c < e) {
                                    System.out.println("El numero menor es:" + "" + c);
                                    double w = x + c;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es" + " " + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                } else if (d < a && d < b && d < c && d < e) {
                                    System.out.println("el numero menor es:" + "" + d);
                                    double w = x + d;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es:" + " " + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                } else if (e < a && e < b && e < c && e < d) {
                                    System.out.println("el numero menor es:" + "" + e);
                                    double w = x + e;
                                    for (int i = 1; i <= w; i++) {
                                        factorial *= i;
                                    }
                                    System.out.println("La suma del numero menor con la raiz del mayor es:" + " " + w);
                                    System.out.println("el factorial de la suma es" + "" + factorial);
                                    if (w % 2 == 0) {
                                        System.out.println("La suma es par");
                                    } else {
                                        if (w % 2 != 0) {
                                            System.out.println("la suma es impar");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception c) {
            System.out.println("el valor no es numerico, si ingreso valores decimales con (.) no son validos");
        }
    }
}