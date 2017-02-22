package com.Week_02;

/**
 * Використовуючи цикл for виведіть на екран матрицю. Зверніть увагу на форматування (відступи):

 *  2  3  4  *
 6  *  8  * 10
 11 12  * 14 15
 16  * 18  * 20
 * 22 23 24  *

 */
public class Task02 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == j || j == 4 - i)
                    System.out.print(" * ");
                else
                System.out.printf("%2d ", k);
                k++;
            }
            System.out.println();

        }
    }
}
