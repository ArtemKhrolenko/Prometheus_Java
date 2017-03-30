package com.Week_07;


public class Tests {



    public static void main(String args[]) throws Exception {
        String str = "5t";

        try {
            System.out.println(Integer.parseInt(str));
        }
        catch (Test e){
            //System.out.println(e.getMessage());
            System.out.println(e.getMessage());
        }
    }
}
