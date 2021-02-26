package com.chantaldegracia;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bienvenido a tu calculadora. Ingresa 2 números: \n");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.print("¿Qué operación necesitas? \n 1. + \n 2. - \n 3. * \n 4. / \n");
        int x = sc.nextInt();
        double resp;
        Main Calculator = new Main();

        switch (x){
            case 1:{
        System.out.println(CALCULOS.sumar(num1,num2));
                break;}
            case 2:{
                System.out.println(CALCULOS.restar(num1,num2));
                break;}
            case 3:{
                System.out.println(CALCULOS.mult(num1,num2));
                break;}
            case 4:{
                System.out.println(CALCULOS.div(num1,num2));
                break;}
        }}}

