package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0;
        System.out.print("Введите число a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        System.out.print("Введите число b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        if(a == b) {
            System.out.println("Числа a и b равны");
        } else if(a > b) {
            System.out.println("Число a наибольшее");
        } else {
            System.out.println("Число b наибольшее");
        }
    }
}
