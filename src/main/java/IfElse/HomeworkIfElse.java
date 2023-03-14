package IfElse;

public class HomeworkIfElse {
    public static void main(String[] args) {
//1
        int num1 = 5;
        int num2 = 7;
        int num3 = 5;

        if (num1 == num2){
            System.out.println("Two of the numbers are equal");
        }else if (num1 == num3){
            System.out.println("Two of the numbers are equal");
        }else if (num2 == num3){
            System.out.println("Two of the numbers are equal");
        }else {
            System.out.println("None of the numbers are equal");
        }
//2
        int num = 9;

        if (num % 3 == 0 || num % 5 == 0){
            System.out.println("Multiple of 3 or 5");
        }else {
            System.out.println("Not a multiple of 3 or 5");
        }
//3
        int a = 4;
        int b = 3;
        if ((a+b) % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
//4
        int number = 39;

        if (number == 2 || number == 3){
            System.out.println("Prime");
        }else if (number % 2 == 0 || number % 3 == 0){
            System.out.println("Not prime");
        }else {
            System.out.println("Prime");
        }



    }
}
