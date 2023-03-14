package Loop;

import java.util.Scanner;

public class HomeworkSumOfOddIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter positive number");
        int j = scanner.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= j){
            if (i % 2 != 0){
                sum+=i;
            }i++;
        }
        System.out.println("Sum of odd integer up to " + j + " is " + sum);

        if (j <= 0){
            System.out.println("Input must be positive, try again");
        }











    }
}
