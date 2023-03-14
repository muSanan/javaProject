package Loop;

import java.util.Random;
import java.util.Scanner;

public class GuesNumber {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(1,100);
        System.out.println(randomNumber);
        Scanner scanner = new Scanner(System.in);
        int guessNumber;

        do {
            System.out.println("enter number");
            guessNumber = scanner.nextInt();
            if (guessNumber<randomNumber){
                System.out.println("too lower");
            }else if (guessNumber>randomNumber){
                System.out.println("too higher");
            }else {
                System.out.println("it is ok");
            }

        }while (guessNumber!=randomNumber);










    }
}
