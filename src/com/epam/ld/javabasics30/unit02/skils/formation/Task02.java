package com.epam.ld.javabasics30.unit02.skils.formation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.print("Forward:");
        for (int i = 0; i < 5;) {
            System.out.print(" " + ++i);
        }
        System.out.print("\nBackward:");
        for (int i = 5; i > 0; i--) {
            System.out.print(" " + i);
        }
        System.out.println("\nMultiplying by 3:");
        for (int i = 0; i < 10;) {
            System.out.println("3 x " + ++i + " = " + i*3);
        }
    }
}
