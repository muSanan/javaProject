package practice;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of month");
        int months = scanner.nextInt();
        if (months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12){
            System.out.println("31");
        }else if (months == 2){
            System.out.println("28");
        }else if (months == 4 || months == 6 || months == 9 || months == 11){
            System.out.println("30");
        }






    }
}
