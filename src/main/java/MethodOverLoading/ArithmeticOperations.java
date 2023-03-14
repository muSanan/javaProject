package MethodOverLoading;

public class ArithmeticOperations {

    public int sum(int a,int b){
        return a + b;
    }

    public int sum(int a,int b,int c){
        return a + b + c;
    }

    public int average(int a,int b,int c, int d){
        return (a+b+c+d)/4;
    }

    public int average(int a,int b,int c, int d, int e,int f) {
        return (a + b + c + d + e + f) / 6;
    }

    public double getAreaOfRectangle(int base, int height){
        return base*height/2;
    }
    public double getAreaOfRectangle(int a, int b, int c){
        int s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }







}
