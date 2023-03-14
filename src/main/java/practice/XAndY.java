package practice;

import java.util.Scanner;

public class XAndY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 number");
        int x = scanner.nextInt();
        System.out.println("enter 2 number");
        int y = scanner.nextInt();

        if (x > 0 && y > 0){
            System.out.println("Both x and y are positive");
        }else if (x < 0 && y < 0){
            System.out.println("Both x and y are negative");
        }else if (x == 0 || y == 0){
            System.out.println("Either x or y is zero");
        }else {
            System.out.println("Either x or y is negative");
        }



    }
}
