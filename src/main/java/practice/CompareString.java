package practice;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 sentence");
        String str1 = scanner.nextLine();
        System.out.println("enter 2 sentence");
        String str2 = scanner.nextLine();

        if (str1.length() >= str2.length()){
            System.out.println(str1 + ":" + str1.length());
        }else {
            System.out.println(str2 + ":" + str2.length());
        }





    }
}
