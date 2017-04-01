package com.Week_07;

import java.util.Deque;
import java.util.LinkedList;

public class Parser {
    public static double parse(String rpnString) {

        if (rpnString == null || !rpnString.matches("^[-0-9\\s+/*.]+$") || !rpnString.contains(" "))
            throw new RPNParserException();

        Deque<Double> deque = new LinkedList<>();

        String[] list = rpnString.split(" ");

        double result = 0;

        try {
            for (int i = 0; i < list.length; i++) {
                if (list[i].matches("^-*\\d+(\\.\\d+)*"))
                    deque.push(Double.parseDouble(list[i]));
                else if (list[i].matches("^[+\\-*/]$")) {
                    double a = deque.pop();
                    double b = deque.pop();
                    switch (list[i]) {
                        case "+":
                            deque.push(a + b);
                            break;
                        case "-":
                            deque.push(b - a);
                            break;
                        case "*":
                            deque.push(a * b);
                            break;
                        case "/":
                            if (a == 0.0) throw new ArithmeticException();
                            deque.push(b / a);
                            break;
                    }

                }
                else throw new RPNParserException();
            }
            if (deque.size() > 1) throw new RPNParserException();
            result = deque.pop();
        }
        catch (Exception ex){
                if (ex instanceof ArithmeticException)
                    throw new ArithmeticException();
                else
                    throw new RPNParserException();
            }
        return result;
    }

    public static void main(String[] args) {
        String str = args[0];
        System.out.println(parse(str));
    }
}
