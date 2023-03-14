package practice;

import java.util.Scanner;

public class ReplaceVowes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = scanner.nextLine();
        sentence = sentence.replaceAll("[aieuyoAIEUYO]","X");
        System.out.println(sentence);



    }
}
