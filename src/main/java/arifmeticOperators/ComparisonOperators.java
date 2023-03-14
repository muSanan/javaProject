package arifmeticOperators;

public class ComparisonOperators {
    public static void main (String [] args){
        /*
        > more
        < less
        >= more or equal
        <=
        ==
        !=
        */

        byte potato = 5;
        byte fries = 10;
        System.out.println(potato > fries);//false
        System.out.println(potato < fries);//true
        System.out.println(potato >= fries);//false
        System.out.println(potato <= fries);//true
        System.out.println(potato == fries);//false
        System.out.println(potato != fries);//true

        byte by1 = 4;
        byte by2 = 99;

        short sh1 = 6;
        short sh2 = -34;

        int in1 = 390;
        int in2 = 746;

        long lo1 = 2345;
        long lo2 = -3476;

        System.out.println(by1 > sh1);
        System.out.println(by2 > sh1);
        System.out.println(by1 > in1);
        System.out.println(sh1 > in2);
        System.out.println(by2 == in1);
        System.out.println(in2 == sh2);
        System.out.println(sh2 != in1);

        boolean isEqual = by2 != sh1;
        boolean more = in1 > sh2;
        boolean less = by1 < in2;
        boolean notEqual = in1 != sh1;
        System.out.println(isEqual);
        System.out.println(more);
        System.out.println(less);
        System.out.println(notEqual);

        /*
        concatenation - works with String ""
         */
        System.out.println(1+2);//3
        System.out.println(1+2+"hello");//3 hello
        System.out.println("hello"+1+2);//hello12
        System.out.println((1+2==3) + "hello" + 4*5);//truehello20
















    }




}
