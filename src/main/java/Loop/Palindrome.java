package Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String word = scanner.nextLine();

        boolean isPalindrome = true;
        //hello
        for (int i = 0; i < word.length()/2; i++){
            if (word.charAt(i)!= word.charAt(word.length()-i-1)){
                isPalindrome = false;
                break;
            }
            }
        if (isPalindrome){
            System.out.println("It's a palindrome");
        } else {
                System.out.println("It's a not palindrome");
            }












    }
}
