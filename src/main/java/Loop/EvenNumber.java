package Loop;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("enter even number");
            number = scanner.nextInt();
        }while (number % 2 != 0);



    }
}
