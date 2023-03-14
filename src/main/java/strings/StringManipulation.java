package strings;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word1");
        String word1 = scanner.nextLine();
        System.out.println("enter word2");
        String word2 = scanner.nextLine();

        System.out.println(word1.toLowerCase() + word2.substring(0,1).toUpperCase() + word2.substring(1).toLowerCase());

        System.out.println(word1.toUpperCase() + " " + word2.toLowerCase() + " " + word2.toLowerCase() + " " + word1.toUpperCase());

        System.out.println(word1.replace('a',' ') + " " + word2.replace('a',' '));

        System.out.println(word1.toUpperCase().substring(0,1) + word2.toUpperCase().substring(0,1));

        System.out.println(word1.toUpperCase().charAt(0) + word1.substring(1,2) + word2.toUpperCase().charAt(0) + word2.substring(1,2));

        System.out.println(word1.toUpperCase().charAt(3) + word1.substring(4,5) + word2.toUpperCase().charAt(4) + word2.substring(5,6));

//================================================================================







    }
}
