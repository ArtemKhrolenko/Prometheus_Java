package com.Week_05.TestCheck;


public class Test {
    public static void main(String[] args)
    {
        int result = new B()
        {
            int sum(int a, int b)
            {
                return a+b;
            }
        }.sum(2, 3);
        System.out.println(result);
    }
}
