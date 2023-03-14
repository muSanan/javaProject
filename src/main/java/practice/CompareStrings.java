package practice;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter anything1");
        String str1 = scanner.nextLine();
        System.out.println("enter anything2");
        String str2 = scanner.nextLine();
        if (str1.equals(str2)){
            System.out.println("EQUAL");
        }else {
            System.out.println("NOT EQUAL");
        }



    }
}
