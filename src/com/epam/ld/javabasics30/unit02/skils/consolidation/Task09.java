package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] d = new double[3];
        for (int i = 0; i <3 ; i++) {
            System.out.print("Введите действительное число: ");
            if (sc.hasNextDouble()) {
                d[i] = sc.nextDouble();
            }
        }
        System.out.println("Результат:");
        for (int i = 0; i < 3; i++) {
            double result = d[i];
            result *= result;
            System.out.print(d[i]);
            if(d[i] < 0) {
                result *= result;
                System.out.print(" (отрицательное, в четвертую степень) ");
            } else {
                System.out.print(" (неотрицательное, в квадрат) ");
            }
            System.out.println(result);
        }
    }
}
