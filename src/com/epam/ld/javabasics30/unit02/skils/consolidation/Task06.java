package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0, c=0, x=0, result;
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
        System.out.print("Треугольник ");
        if(!((a == b) && (b == c))) {
            System.out.print("не ");
        }
        System.out.println("является равносторонним");
    }
}
