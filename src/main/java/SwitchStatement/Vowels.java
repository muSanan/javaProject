package SwitchStatement;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        char letter = 'A';

        switch (letter){
            case 'A','E','I','O','U':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("consonant");
                break;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter letter");
        String let = scanner.nextLine();
        switch (let){
            case "A":
                System.out.println("Hello man!");
                break;
            case "B":
                System.out.println("Bye man");
                break;
            case "C":
                System.out.println("Good job!");
                break;
            case "D":
                System.out.println("Try again");
                break;
            case "F":
                System.out.println("Never give up");
                break;





        }










    }
}
