package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=0;
        int count=0;
        System.out.print("Введите натуральное число: ");
        if (sc.hasNextLong()) {
            n = sc.nextLong();
        }
        if(n <= 0) {
            System.out.println("Число должно быть натуральным!");
        } else {
            System.out.print("Количество четных цифр в числе " + n + ": ");
            do{
                count += (n % 2) - 1;
            } while ((n=n/10) > 0);
            System.out.println(-count);
        }
    }
}
