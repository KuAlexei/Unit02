package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;

public class Task18 {

    public static final String COLUMN1_HEADER_TEXT = "      x      ";
    public static final String COLUMN2_HEADER_TEXT = "  f(x)=sin\u00B2(x)  ";
    public static final int COLUMN1_WIDTH = COLUMN1_HEADER_TEXT.length();
    public static final int COLUMN2_WIDTH = COLUMN2_HEADER_TEXT.length();

    public static final String VERTICAL = "\u2551";
    public static final String HORIZONTAL = "\u2550";

    public static final String TABLE_TOP_LEFT = "\u2554";
    public static final String TABLE_COLUMN1_LINE = new String(new char[COLUMN1_WIDTH]).replace("\0", HORIZONTAL);
    public static final String TABLE_TOP_CENTER = "\u2566";
    public static final String TABLE_COLUMN2_LINE = new String(new char[COLUMN2_WIDTH]).replace("\0", HORIZONTAL);
    public static final String TABLE_TOP_RIGHT = "\u2557";

    public static final String HEADER_ROW = VERTICAL + COLUMN1_HEADER_TEXT + VERTICAL + COLUMN2_HEADER_TEXT + VERTICAL;

    public static final String HEADING_LEFT = "\u2560";
    public static final String HEADER_BOTTOM_CENTER = "\u256C";
    public static final String HEADING_RIGHT = "\u2563";

    public static final String OUTPUT_FORMAT = VERTICAL + " % 8.8f " + VERTICAL + " % 11.11f " + VERTICAL + "\n";

    public static final String COLUMN_LEFT = "\u255F";
    public static final String ROW_HORIZONTAL = "\u2500";
    public static final String ROW_COLUMN1_LINE = new String(new char[COLUMN1_WIDTH]).replace("\0", ROW_HORIZONTAL);
    public static final String COLUMN_ROW_CROSSING = "\u256B";
    public static final String ROW_COLUMN2_LINE = new String(new char[COLUMN2_WIDTH]).replace("\0", ROW_HORIZONTAL);
    public static final String COLUMN_RIGHT = "\u2562";

    public static final String TABLE_BOTTOM_LEFT = "\u255A";
    public static final String TABLE_BOTTOM_CENTER = "\u2569";
    public static final String TABLE_BOTTOM_RIGHT = "\u255D";

    public static final String TABLE_TOP = TABLE_TOP_LEFT + TABLE_COLUMN1_LINE + TABLE_TOP_CENTER + TABLE_COLUMN2_LINE + TABLE_TOP_RIGHT;
    public static final String HEADING_BOTTOM = HEADING_LEFT + TABLE_COLUMN1_LINE + HEADER_BOTTOM_CENTER + TABLE_COLUMN2_LINE + HEADING_RIGHT;
    public static final String ROW_SEPARATOR = COLUMN_LEFT + ROW_COLUMN1_LINE + COLUMN_ROW_CROSSING + ROW_COLUMN2_LINE + COLUMN_RIGHT;
    public static final String TABLE_BOTTOM = TABLE_BOTTOM_LEFT + TABLE_COLUMN1_LINE + TABLE_BOTTOM_CENTER + TABLE_COLUMN2_LINE + TABLE_BOTTOM_RIGHT;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0, b=0, h=0;
        System.out.print("Введите a: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        }
        System.out.print("Введите b: ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();
        }
        System.out.print("Введите h: ");
        if (sc.hasNextDouble()) {
            h = sc.nextDouble();
        }
        if(a > b) {
            System.out.println("'a' должно быть не больше 'b'");
        } else if(h > 0) {
            System.out.println(TABLE_TOP);
            System.out.println(HEADER_ROW);
            System.out.println(HEADING_BOTTOM);
            while(true) {
                double sinA = Math.sin(a);
                System.out.printf(OUTPUT_FORMAT, a , (sinA*sinA));
                if((a += h) <= b) {
                    System.out.println(ROW_SEPARATOR);
                } else {
                    System.out.println(TABLE_BOTTOM);
                    break;
                }
            }
        } else {
            System.out.println("Шаг 'h' должен быть больше нуля!");
        }
    }
}
