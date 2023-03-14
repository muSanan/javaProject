package Loop;

import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();//hello

        boolean isPalindrome = true;

        for (int i = 0; i < word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length()-i-1)){
                isPalindrome = false;
            }

        }
        if (isPalindrome){
            System.out.println("is palindrome");
        }else {
            System.out.println("not palindrome");
        }


    }
}
