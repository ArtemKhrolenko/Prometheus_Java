package com.Week_02;

/**
 * Напишіть застосування для сортування масиву методом сортування Шелла (ShellSort). Завдання додаткове!
 */
public class Task04 {
    public static void main(String[] args) {
        //------source data-------------------------//
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        //------------------------------------------//
        int j;
        int step = length / 2;
        while (step > 0)
        {
            for (int i = 0; i < (length - step); i++) {
                j = i;
                while ((j >= 0) && (array[j] > array[j + step]))
                {
                    int tmp = array[j];
                    array[j] = array[j + step];
                    array[j + step] = tmp;
                    j -= step;
                }
            }
            step = step / 2;
        }

        //------source data-------------------------//
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        //------------------------------------------//
    }
}
