package IfElse;

import java.util.Scanner;

public class ContainsE {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter some words");
        String words = scanner.nextLine();

        if (words.contains("e")){
            System.out.println(words.indexOf('e'));
        }
        else{
            System.out.println("The doesn't contain 'e'");
        }






    }
}
