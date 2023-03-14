package arifmeticOperators;

public class OperatorsHomework {
    public static void main (String [] args){
        //1
        int a = 100;
        int b = 200;
        System.out.println(a+b);

        //2
        int q = 5;
        int w = 9;
        int e = 10;
        System.out.println(q+w+e);

        //3
        System.out.println("1 + 2 = " + (1+2));
        System.out.println("3 - 1 = " + (3-1));
        System.out.println("2 * 2 = " + (2*2));
        System.out.println("4 / 2 = " + (4/2));
        System.out.println("2 + 8 = " + (2+8));
        System.out.println("10 % 7 = " + (10%7));

        //4
        byte Length = 15;
        byte width = 9;
        System.out.println("The area of a rectangle is: " + (Length*width));
        System.out.println("The perimeter of rectangle is: " + (Length*2+width*2));

        //5
        short sho1 = 8;
        short sho2 = 2345;
        int int1 = (sho1+sho2)/3;
        System.out.println((int1%5)*5);

        //6
        int var1;
        var1 = sho1+=2345;
        int var2;
        var2 = var1/=3;
        int var3;
        var3 = var2%=5;
        int total = var3*=5;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(total);

        //7
        System.out.println(23==45);
        System.out.println(-10==10);







    }
}
