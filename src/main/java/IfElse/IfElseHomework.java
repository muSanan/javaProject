package IfElse;

public class IfElseHomework {
    public static void main(String[] args) {
//1
        int number = 40;
        if (number > 0){
            System.out.println("number is positive");
        }else if (number < 0){
            System.out.println("number is negative");
        }else {
            System.out.println("number is 0");
        }

//2
        int year = 2100;
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("year is leap");
            }else if (year % 400 == 0){
            System.out.println("year is leap");
        }else {
            System.out.println("year is not leap");
        }
//3
        int num1 = 3;
        int num2 = 123;
        if (num1 > num2){
            System.out.println("num1 is larger");
        }else if (num2 > num1){
            System.out.println("num2 is larger");
        }else {
            System.out.println("num1 and num2 are equal");
        }
//4
        double tempInFahrenheit = 77.3;
        if (tempInFahrenheit <= 32){
            System.out.println("temperature is freezing");
        }else if(tempInFahrenheit >= 212){
            System.out.println("temperature is boiling");
        }else {
            System.out.println("temperature is between boiling and freezing");
        }
//5
        byte month = 1;
        if (month >=3 && month <=5){
            System.out.println("It is spring");
        }else if (month >=6 && month <= 8){
            System.out.println("It is summer");
        }else if (month >= 9 && month <= 11){
            System.out.println("It is fall");
        }else {
            System.out.println("It is winter");
        }





    }
}
