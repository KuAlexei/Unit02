package com.epam.ld.javabasics30.unit02.skils.consolidation;

public class Task14 {

    public static final int DIGITSUMM = 15;

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("i=" + i);
            for (int j = 0; j < 10; j++) {
                int ij = i + j;
                if (ij > DIGITSUMM) break;
                for (int k = 0; k < 10; k++) {
                    int ijk = ij + k;
                    if (ijk > DIGITSUMM) break;
                    if (ijk > DIGITSUMM-10) {
                        System.out.println("" + i + j + k + (DIGITSUMM - ijk));
                    }
                }
            }
        }
    }
}
