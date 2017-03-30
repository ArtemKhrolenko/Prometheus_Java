package com.Week_06;

import java.util.ArrayList;

public class CodeRLELIST {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        String str = args[0];
        if (str == null) return;
        if (str.equals("")){
            System.out.println("");
            return;
        }

        //Формируем списки с буквами и счетчиком повторений
        charList.add(str.charAt(0));
        int counter = 1;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                counter++;
            }
            else {
                numbers.add(counter);
                charList.add(str.charAt(i + 1));
                counter = 1;
            }
        }
        numbers.add(counter);

        String resultTmp = "";
//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(String.valueOf(charList.get(i)) + " " + numbers.get(i));
//        }

        for (int i = 0; i < charList.size() ; i++){
            int intNumber = numbers.get(i);
            if (intNumber <= 9){
                resultTmp += intNumber == 1 ? String.valueOf(charList.get(i)) : String.valueOf(charList.get(i)) + numbers.get(i);
            }
            else {
                int main = intNumber / 9;
                int rest = intNumber % 9;
                for (int j = 0; j < main; j++) {
                    resultTmp += String.valueOf(charList.get(i)) + 9;
                }
                if (rest > 0) resultTmp += String.valueOf(charList.get(i)) + rest;
            }
        }
        System.out.println(resultTmp);
    }
}
