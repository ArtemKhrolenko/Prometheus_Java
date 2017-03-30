package com.Week_06;

public class DeCodeRLE {
    public static void main(String[] args) {
        String decode = args[0];

        if (decode == null) return;
        if (decode.equals("") || Character.isDigit(decode.charAt(0))){
            System.out.println("");
            return;
        }

        String result = String.valueOf(decode.charAt(0));

        boolean flag = false;

        int i = 1;
        while (i < decode.length()) {

            if (!Character.isDigit(decode.charAt(i))){
                if (decode.charAt(i) == decode.charAt(i - 1)) break;
                result += String.valueOf(decode.charAt(i));
                flag = false;
            }
            else {
                if (flag) break;
                int digit = Integer.parseInt(String.valueOf(decode.charAt(i))) ;
                for (int j = 0; j < digit - 1; j++){
                    result += String.valueOf(decode.charAt(i - 1));
                }
                flag = true;
            }
            i++;
        }
        result = i == decode.length() ? result : "";
        System.out.println(result);

    }
}
