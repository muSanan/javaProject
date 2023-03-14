package practice;

import java.util.Scanner;

public class ABCBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1 boolean");
        boolean a = scanner.nextBoolean();
        System.out.println("enter 2 boolean");
        boolean b = scanner.nextBoolean();
        System.out.println("enter 3 boolean");
        boolean c = scanner.nextBoolean();

        if ((a && b) || (a && c) || (b && c)){
            System.out.println("At least two are true");
        }
        if (a && b && c){
            System.out.println("All are true");
        }
        if ((a && !b && !c) || (!a && b && !c) || (!a && !b && c)){
            System.out.println("Less than two are true");
        }




    }
}
