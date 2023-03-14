package ProblemSolving;

import java.util.Scanner;

public class LettersFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++){
            int counter = 0;
            for (int j = 0; j < word.length(); j++){
                if (word.charAt(i) == word.charAt(j)){
                    counter++;
                }
            }
            System.out.println(word.charAt(i) + ": " + counter);
        }






        }



    }

