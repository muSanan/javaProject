package SwitchStatement;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of month");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 2 || month == 12){
            System.out.println("winter");
        }
        else if (month >=3 && month<=5){
            System.out.println("spring");
        }
        else if (month >=6 && month <= 8){
            System.out.println("summer");
        }
        else if (month >= 9 && month <= 11){
            System.out.println("fall");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter month number");
        int monthNumber = sc.nextInt();
        switch (monthNumber){
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;





        }







    }
}
