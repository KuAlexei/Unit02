package com.epam.ld.javabasics30.unit02.skils.consolidation;

import java.util.Scanner;
import java.util.Set;

public class Task19 {

    private static final int CELL_CHARCODE_WIDTH = 5;
    private static final int CELL_CHAR_WIDTH = 3;

    private static final String CELL_DELIM = "\u2502";
    private static final String VERTICAL = "\u2551";
    private static final String HORIZONTAL = "\u2550";

    private static final String OUTPUT_FORMAT = " %3d " + CELL_DELIM + " %1c " + VERTICAL;

    private static final String CELL_CHARCODE_HORIZONTAL = new String(new char[CELL_CHARCODE_WIDTH]).replace("\0", HORIZONTAL);
    private static final String CELL_CHAR_HORIZONTAL = new String(new char[CELL_CHAR_WIDTH]).replace("\0", HORIZONTAL);

    private static final String TABLE_TOP_LEFT = "\u2554";
    private static final String TABLE_TOP_CELL_DELIM = "\u2564";
    private static final String TABLE_TOP_CENTER = "\u2566";
    private static final String TABLE_TOP_RIGHT = "\u2557";
    private static final String COLUMN_TOP = CELL_CHARCODE_HORIZONTAL + TABLE_TOP_CELL_DELIM + CELL_CHAR_HORIZONTAL;
    private static final String TABLE_TOP = TABLE_TOP_LEFT + new String(new char[15]).replace("\0", COLUMN_TOP + TABLE_TOP_CENTER) + COLUMN_TOP + TABLE_TOP_RIGHT;

    private static final String TABLE_MIDDLE_LEFT = "\u2560";
    private static final String TABLE_MIDDLE_CELL_DELIM = "\u256A";
    private static final String TABLE_MIDDLE_CENTER = "\u256C";
    private static final String TABLE_MIDDLE_RIGHT = "\u2563";
    private static final String COLUMN_MIDDLE = CELL_CHARCODE_HORIZONTAL + TABLE_MIDDLE_CELL_DELIM + CELL_CHAR_HORIZONTAL;
    private static final String TABLE_MIDDLE = "\n" + TABLE_MIDDLE_LEFT + new String(new char[15]).replace("\0", COLUMN_MIDDLE + TABLE_MIDDLE_CENTER) + COLUMN_MIDDLE + TABLE_MIDDLE_RIGHT;

    private static final String TABLE_BOTTOM_LEFT = "\u255A";
    private static final String TABLE_BOTTOM_CELL_DELIM = "\u2567";
    private static final String TABLE_BOTTOM_CENTER = "\u2569";
    private static final String TABLE_BOTTOM_RIGHT = "\u255D";
    private static final String COLUMN_BOTTOM = CELL_CHARCODE_HORIZONTAL + TABLE_BOTTOM_CELL_DELIM + CELL_CHAR_HORIZONTAL;
    private static final String TABLE_BOTTOM = TABLE_BOTTOM_LEFT + new String(new char[15]).replace("\0", COLUMN_BOTTOM + TABLE_BOTTOM_CENTER) + COLUMN_BOTTOM + TABLE_BOTTOM_RIGHT;

    public static void main(String[] args) {
        System.out.println(TABLE_TOP);
        for (byte i = 0; i < 16; i++) {
            System.out.print(VERTICAL);
            for (byte j = 0; j < 16; j++) {
                int intChar = (i<<4)+j;
                System.out.printf(OUTPUT_FORMAT, intChar, Character.isISOControl(intChar)?32:intChar);
            }
            System.out.println(i==15?"":TABLE_MIDDLE);
        }
        System.out.println(TABLE_BOTTOM);
    }
}
