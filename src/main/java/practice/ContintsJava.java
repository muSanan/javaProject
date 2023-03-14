package practice;

import java.util.Scanner;

public class ContintsJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any word:");
        String word = scanner.nextLine();

        if (word.toLowerCase().contains("java")){
            System.out.println("contain java");
        }else {
            System.out.println("doesn't contain java");
        }
//===================================






    }
}
