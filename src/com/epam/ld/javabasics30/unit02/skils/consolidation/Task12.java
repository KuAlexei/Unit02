package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s="";
        System.out.print("Введите строку: ");
        if (sc.hasNextLine()) {
            s = sc.nextLine();
        }
        if(Pattern.matches("^[\\D&&\\w][\\w]*$", s)) {
            System.out.println("В строке нет недопустимых символов.");
        } else {
            System.out.println("В строке есть недопустимые символы!");
        }
    }
}
