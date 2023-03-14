package SkannerClass;

import java.util.Scanner;

public class InputValidationClass {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Enter first number:");
        short num1 = a.nextShort();

        if (num1 >=1 && num1<=10){
            System.out.println("number is valid");
        }else {
            System.out.println("number is invalid");
        }

    }
}
