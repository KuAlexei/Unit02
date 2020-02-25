package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        long result=1;
        int i=2;
        for (int sum = 3; i <= 10 ; sum += ++i) {
            result = result * sum;
        }
        System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) = " + result);
    }
}
