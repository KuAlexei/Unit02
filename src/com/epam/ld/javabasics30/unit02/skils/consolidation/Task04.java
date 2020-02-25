package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0, c=0, x=0, result;
        System.out.print("Введите число a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        System.out.print("Введите число b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        System.out.print("Введите число c: ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        }
        System.out.print("Введите число x: ");
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
        }
        result = Math.abs(a * x * x + b * x + c);
        System.out.println("f(x)=|ax\u00B2+bx+c|=" + result);
    }
}
