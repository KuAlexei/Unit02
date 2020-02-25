package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=0, b=0;
        System.out.print("Введите натуральное число 'a': ");
        if (sc.hasNextLong()) {
            a = sc.nextLong();
        }
        System.out.print("Введите натуральное число 'b': ");
        if (sc.hasNextLong()) {
            b = sc.nextLong();
        }
        if((a <= 0) || (b <= 0)) {
            System.out.println("Числа должны быть натуральными!");
        } else {
            Set<Long> setA = new HashSet<>();
            do{
                setA.add(a % 10);
            } while ((a=a/10) > 0);
            Set<Long> setB = new HashSet<>();
            do{
                setB.add(b % 10);
            } while ((b=b/10) > 0);
            setA.retainAll(setB);
            if(setA.size() > 0) {
                System.out.print("Найдены следующие 'общие' цифры:");
                for (Long digit:setA) {
                    System.out.print(" " + digit);
                }
                System.out.println();
            } else {
                System.out.println("Нет цифр входящих в оба числа.");
            }
        }
    }
}
