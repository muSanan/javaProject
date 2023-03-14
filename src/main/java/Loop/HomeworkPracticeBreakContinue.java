package Loop;

import java.util.Scanner;

public class HomeworkPracticeBreakContinue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter positive number");
        int j = scanner.nextInt();

        if (j < 0){
            System.out.println("Input must be positive, try again");
        }
        for (int i = 1; i <= j; i++){
            if (i % 3 == 0 && i % 5 !=0){
                System.out.println(i);
            }
            else if (i % 3 != 0 || i % 5 ==0){
                continue;
            }
        }
        if (j <=2){
            System.out.println("There are not numbers less than " + j + " that are divisible by 3 and not divisible by 5");
        }









    }
}
