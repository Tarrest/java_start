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

        //выполняем функцию через обект s класса Square
        Square s = new Square(90);
        System.out.println("квадрат со стороной " + s.l + " равен " + s.area());

        Rectagular r = new Rectagular(70, 75);
        System.out.println("прямоугольник со сторонами "+ r.a + " и " + r.b + " равен " + r.area());
    }

    //функция, которая может быть вызвана без создания класса
    public static void hello() {
        System.out.println("Hello, " + "World2!");
    }

    public static void hello(String smth) {
        System.out.println("Hello, " + smth);
    }

    public static double area(double len){
        return len*len;
    }

    public static double area(double a, double b) {
        return a*b;
    }





}
