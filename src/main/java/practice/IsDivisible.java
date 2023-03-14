package practice;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter # 1");
        int num1 = scanner.nextInt();
        System.out.println("enter # 2");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0){
            System.out.println("DIVISIBLE");
        }else {
            System.out.println("NOT DIVISIBLE");
        }
//--------------------------------------------------------------









    }
}
