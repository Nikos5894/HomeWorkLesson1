package com.company.cursor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // x+y-a/2*(x+w)
        // a*(x+x)/y-a*3
        //a+b/x-y
        //X-e/2%e+1
        double x = 1, y = 2, a = 3, b = 4, e = 5, w = 6, X = 7;
        double result1, result2 ,result3, result4;
        result1 = x+y-a/2*(x+w);
        result2 = a*(x+x)/y-a+3;
        result3 = a+b/x-y;
        result4 = X-e/2%e+1;
        System.out.println(x+y-a/2*(x+w));
        System.out.printf("x+y-a/2*(x+w)\n" +
                "result1 = %f\n" +
                "a*(x+x)/y-a*3\n" +
                "result2 = %f\n" +
                "a+b/x-y\n" +
                "result3 = %f\n" +
                "X-e/2%%e+1\n" +
                "result4 = %f",result1,result2,result3,result4);

    }
}
