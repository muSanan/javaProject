package Loop;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();

        for (int i = 1; i <= (number+number2); i++) {
            System.out.println(i);
            if (i >= 45) {
                break;
            }
            System.out.println();
        }



    }
}
