package com.epam.ld.javabasics30.unit02.skils.formation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        if (1 < 2) {
            System.out.println("7");
        } else {
            System.out.println("8");
        }
        if (1 < 2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        Scanner sc = new Scanner(System.in);
        double a=0;
        System.out.print("Введите число a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        if(a < 3) {
            System.out.println("yes");
        } else if(a > 3) {
            System.out.println("no");
        } else {
            // nothing to do!
        }
    }
}
