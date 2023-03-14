package Loop;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter negative number");
            number = scanner.nextInt();
            System.out.println("please");
        }while (number >= 0);


    }
}
