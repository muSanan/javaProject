package Loop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("enter 1 number");
            int number1 = scanner.nextInt();
            System.out.println("enter +, -, *, /");
            String operator = scanner.next();
            System.out.println("enter 2 number");
            int number2 = scanner.nextInt();

            if (operator.equals("+")){
                System.out.println(number1+number2);

            }else if (operator.equals("-")){
                System.out.println(number1-number2);
            }else if (operator.equals("/")){
                System.out.println(number1/number2);
            }else if (operator.equals("*")){
                System.out.println(number1*number2);
            }else {
                System.out.println("invalid");
            }
            System.out.println("try again?");
            answer = scanner.next();
            }while (answer.equals("yes"));


    }
}
