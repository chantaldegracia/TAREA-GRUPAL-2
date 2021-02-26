package com.chantaldegracia;
public class CALCULOS{

    // ATRIBUTOS
    private double num1;
    private double num2;
    private double resp;

    // CONSTRUCTORES
    public CALCULOS(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // MÉTODOS
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // MÉTODOS ESPECIALES
    public static double sumar(double a, double b){
        System.out.print("El resultado es: \n");
        return a+b;
    }
    public static double restar(double a, double b){
        System.out.print("El resultado es: \n");
        return a-b;
    }
    public static double mult(double a, double b){
        System.out.print("El resultado es: \n");
        return a*b;
    }
    public static double div(double a, double b){
        System.out.print("El resultado es: \n");
        return a/b;
    }
    }
