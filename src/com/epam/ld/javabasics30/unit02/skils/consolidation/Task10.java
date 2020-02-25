package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0, c=0, d=0, result;
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
        System.out.print("Введите число d: ");
        if (sc.hasNextDouble()) {
            d = sc.nextDouble();
        }
        result = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("max{min(a, b), min(c, d)} = " + result);
    }
}
