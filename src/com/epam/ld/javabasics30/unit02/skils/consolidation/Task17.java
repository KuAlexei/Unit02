package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, result=1;
        int n=0;
        System.out.print("Введите a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        System.out.print("Введите n: ");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        if(n > 0) {
            for (int i = 0; i < n; i++) {
                result = result * (a + i);
            }
            System.out.println(" a(a+1)...(a+n-1) = " + result);
        } else {
            System.out.println("n должно быть натуральным числом!");
        }
    }
}
