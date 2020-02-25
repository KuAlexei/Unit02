package com.epam.ld.javabasics30.unit02.skils.formation;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x=0;
        System.out.print("Введите x: ");
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
        }
        System.out.print("F(x)");
        if(x > 3) {
            System.out.println("=" + (1 / (x * x + 1)));
        } else if(x <= -3) {
            System.out.println("=9");
        } else {
            System.out.println(" неопределена для x=" + x);
        }
    }
}
