package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String word = scanner.nextLine();
        //hello
        for (int i = word.length(); i >=1; i--){
            System.out.print(word.charAt(i-1));
        }




    }
}
