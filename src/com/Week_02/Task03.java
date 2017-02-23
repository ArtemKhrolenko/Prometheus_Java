package com.Week_02;

/**
 * Напишіть застосування для сортування масиву методом бульбашки
 */
public class Task03 {
    public static void main(String[] args) {
        //------source data-------------------------//
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        //------------------------------------------//

        int tmpExchange;
        for (int i = 0; i < length; i++){
            for (int j = 0; j < length - i - 1; j++){
                if (array[j + 1] < array[j]){
                    tmpExchange = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmpExchange;
                }
            }
        }

        //------source data-------------------------//
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        //------------------------------------------//

    }
}
