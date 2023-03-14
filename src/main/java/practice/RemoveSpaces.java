package practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = scanner.nextLine();
        System.out.println(sentence.replace(" ",""));

    }
}
