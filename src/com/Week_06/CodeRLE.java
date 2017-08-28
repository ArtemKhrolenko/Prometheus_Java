package com.Week_06;


import java.util.Arrays;

public class CodeRLE {
    public static void main(String[] args) {
        String str = "HHeeljjjloooooooo";

        //Формируем строку с буквами и счетчиком повторений
        String resultTmp = String.valueOf(str.charAt(0));
        int counter = 1;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                counter++;
            }
            else {
                resultTmp += counter;
                resultTmp += String.valueOf(str.charAt(i + 1));
                counter = 1;
            }
        }
        resultTmp += counter;

        System.out.println(resultTmp); // удалить строку перед проверкой

        //формируем массивы букв и кол=ва их повторений
        String[] letters = resultTmp.split("\\d");
        String[] nums =  resultTmp.replaceAll("\\D+", " ").trim().split(" ");

        System.out.println(Arrays.toString(letters)); // удалить строку перед проверкой
        System.out.println(Arrays.toString(nums)); // удалить строку перед проверкой

        //анализируем каждое повторение на предмет больше или меньше 9ти
        resultTmp = "";
        for (int i = 0; i < letters.length ; i++){
            int intNumber = Integer.parseInt(nums[i]);
            if (intNumber <= 9){
                resultTmp += intNumber == 1 ? letters[i] : letters[i] + nums[i];
            }
            else {
                int main = intNumber / 9;
                int rest = intNumber % 9;
                for (int j = 0; j < main; j++) {
                    resultTmp += letters[i] + 9;
                }
                if (rest > 0) resultTmp += letters[i] + rest;

            }
        }
        System.out.println(resultTmp);

    }
}
