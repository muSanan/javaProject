package SwitchStatement;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num from 1 to 12");
        int month = scanner.nextInt();

        if (month == 1){
            System.out.println("january");
        }else if (month == 2){
            System.out.println("february");
        }else if (month == 3){
            System.out.println("march");
        }else if (month == 4){
            System.out.println("april");
        }else if (month == 5){
            System.out.println("may");
        }else if (month == 6){
            System.out.println("june");
        }else if (month == 7){
            System.out.println("july");
        }else if (month == 8){
            System.out.println("august");
        }else if (month == 9){
            System.out.println("september");
        }else if (month == 10){
            System.out.println("october");
        }else if (month == 11){
            System.out.println("november");
        }else if (month == 12){
            System.out.println("december");
        }else {
            System.out.println("invalid");
        }

        switch (month){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;



        }





    }
}
