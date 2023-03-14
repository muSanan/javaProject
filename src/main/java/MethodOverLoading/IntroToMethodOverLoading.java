package MethodOverLoading;

public class IntroToMethodOverLoading {

    public int getPerimeterOfSquare(int a){
        return a*4;
    }

    public int getPerimeterOfSquare(long a){
        return (int)(a*4);
    }

    public int getPerimeterOfSquare(double a){
        return (int)(a*4);
    }









}
