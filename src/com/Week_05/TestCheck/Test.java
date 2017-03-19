package com.Week_05.TestCheck;

/**
 * Created by Khrolenko on 19.03.2017.
 */
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
