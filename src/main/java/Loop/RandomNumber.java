package Loop;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(1,100);
        System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        int guessNumber;
        do {
            System.out.println("enter number");
            guessNumber = scanner.nextInt();
            if (guessNumber<randomNumber){
                System.out.println("it is lower");

            }else if (guessNumber>randomNumber){
                System.out.println("it is higher");
            }else {
                System.out.println("it is ok");
                break;
            }
        }while (guessNumber!=randomNumber);


    }
}
