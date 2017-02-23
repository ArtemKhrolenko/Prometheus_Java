package com.Week_02;

/**
 * Напишіть застосування, що виконує пошук заданого числа у відсортованому масиві — бінарний пошук
 * У випадку коли число знайдено виведіть на екран його позицію в масиві (позиції нумеруємо з нуля) або -1 в іншому випадку
 */
public class Task05 {
    public static void main(String[] args) {
        //------source data-------------------------//
        int data[] = { 3, 6, 7, 10, 34, 56, 60, 76};
        int numberToFind = 76;
        //------------------------------------------//
        int middle;
        int position = -1;
        int start = -1, end = data.length;
        while (end - start > 1){
           middle = start + (end - start) / 2;

           if (data[middle] == numberToFind){
               position = middle;
               break;
           }
           if (data[middle] > numberToFind)
               end = middle;
           else
               start = middle;
        }
        System.out.println(position);
    }
}
