package com.Week_02;

/**
 Створіть застосування що знаходить корені квадратного рівняння. Коефіцієнти задаються через змінні:
 double a;
 double b;
 double c;
 */
public class Task01 {
    public static void main(String[] args) {
        //------input parameters---//
        double a = 0;
        double b = 0;
        double c = 999999;
        //-------------------------//

        double discrim = b*b - 4 * a  * c;
        double x1 = 0;
        double x2 = 0;

       if (a == 0 && c != 0 || discrim < 0 || (a == 0 && b == 0 && c == 0))
           System.out.println("x1=\nx2=");

       else{
           if (c != 0){
               x1 = (-b + Math.sqrt(discrim)) / (2*a);
               x2 = discrim == 0 ? x1 : (-b - Math.sqrt(discrim)) / (2*a);
           }
           System.out.println("x1=" + x1);
           System.out.println("x2=" + x2);
       }

    }
}
