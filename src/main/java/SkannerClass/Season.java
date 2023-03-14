package SkannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {

        Scanner season = new Scanner(System.in);

        System.out.println("enter name month");

        String month = season.next();

        if (month.equals("december") ||
                month.equals("january") ||
                month.equals("february")){
            System.out.println("it is winter");
        }else if (month.equals("march") ||
                month.equals("april") ||
                month.equals("may")){
            System.out.println("it is spring");
        }else if (month.equals("june") ||
                month.equals("july") ||
                month.equals("august")){
            System.out.println("it is summer");
        }else {
            System.out.println("it is fall");
        }

    }
}
