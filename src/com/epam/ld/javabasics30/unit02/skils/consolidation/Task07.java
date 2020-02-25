package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r1=0, r2=0;
        System.out.print("Введите радиус первого круга r1: ");
        if (sc.hasNextDouble()) {
            r1 = sc.nextDouble();
        }
        System.out.print("Введите радиус второго круга r2: ");
        if (sc.hasNextDouble()) {
            r2 = sc.nextDouble();
        }
        if((r1 < 0) || (r2 < 0)) {
            System.out.println("Радиус не может быть отрицательным!");
        } else if(r1 == r2) {
            System.out.println("Площади кругов равны!");
        } else if(r1 < r2) {
            System.out.println("Площадь первого круга меньше.");
        } else {
            System.out.println("Площадь второго круга меньше.");
        }
    }
}
