package Loop;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();
        int limit = 40;

        for (int x = 1; x <= number; x++){
            System.out.println(x);
            if (x >= 40){
                break;//stop and jump out
            }
            System.out.println();
        }





    }
}
