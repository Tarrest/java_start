package com.chisw.start.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, World1!");
        hello();
        hello("Test"); //вызов функции с параметром
        System.out.println(area(8.90));
        double a1 = 5;
        double b1 = 7;
        System.out.println(area(a1,b1));
    }

    public static void hello() {
        System.out.println("Hello, " + "World2!");
    }

    public static void hello(String smth) {
        System.out.println("Hello, " + smth);
    }

    public static double area(double l) {
        return l*l;
    }

    public static double area(double a, double b) {
        return a*b;
    }




}
