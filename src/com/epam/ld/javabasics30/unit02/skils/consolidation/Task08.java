package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task08 {

    private static final String[] TRIANGLE_N = {"первого", "второго"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0, c=0, s1=0, s2=0;
        for (int i = 0; i < 2; i++) {
            s1 = s2;
            System.out.println("Введите параметры " + TRIANGLE_N[i] + " треугольника");

            System.out.print("Введите длину стороны a: ");
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
            }
            System.out.print("Введите длину стороны b: ");
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
            }
            System.out.print("Введите длину стороны c: ");
            if (sc.hasNextDouble()) {
                c = sc.nextDouble();
            }
            double halfP = (a + b + c) * 0.5;
            double triangleCheck = halfP * (halfP - a) * (halfP - b) * (halfP - c);
            if (triangleCheck < 0) {
                i--;
                System.out.println("Такого треугольника не существует, повторите ввод!");
            } else {
                s2 = Math.sqrt(halfP);
                System.out.println("Площадь " + TRIANGLE_N[i] + " треугольника: " + s2);
            }
        }
        if(s1 == s2) {
            System.out.println("Площади треугольников равны.");
        } else {
            System.out.println("Площадь " + TRIANGLE_N[(s1 > s2)?0:1] + " треугольника больше");
        }
    }
}
