package Loop;

import java.util.Scanner;

public class HomeworkFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int j = scanner.nextInt();
        int i = j;
        int factorial = 1;

        if (i >= 1){

        while (i >= 1){
            factorial = factorial*i;
            i--;
        }
        System.out.println("Factorial of " + j + " is " + factorial);
        }
        else if (i <= 0){
            System.out.println("enter positive number, try again");
        }







    }
}
