package com.Week_07;


import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String str = "-";
        System.out.println(str.matches("^-*\\d+(\\.\\d+)*"));

        ArrayList<String> list = new ArrayList<>();
        String polishString = "";

        String[] strArray = str.split(" ");

//        System.out.println(Arrays.toString(strArray));
//        System.out.println("-30.0".matches("[-\\d.]+"));
    }

//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))){
//                polishString += String.valueOf(str.charAt(i));
//            }
//
//            else{
//                if (!polishString.isEmpty())
//                    list.add(polishString);
//                if (str.charAt(i) != ' '){
//                    list.add(String.valueOf(str.charAt(i)));
//                }
//                polishString ="";
//            }
//        }
//
//        for (String elem: list)
//            System.out.println(elem);
//
//    }
}
