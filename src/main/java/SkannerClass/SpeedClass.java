package SkannerClass;

import java.util.Scanner;

public class SpeedClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your speed");
        int speed = scanner.nextInt();
        System.out.println("it is your birthday? true/false");
        boolean isBirthday = scanner.nextBoolean();

        if (!isBirthday){
            if (speed <= 60){
                System.out.println("no ticket");
            }else if (speed > 60 && speed <= 80){
                System.out.println("small ticket");
            }else if (speed > 80 && speed <= 100){
                System.out.println("medium ticket");
            }else if (speed > 100){
                System.out.println("large ticket");
            }
        }
        if (isBirthday){
            if (speed <= 80){
                System.out.println("no ticket");
            }else if (speed > 80 && speed <= 100){
                System.out.println("small ticket");
            }else if (speed > 100){
                System.out.println("medium ticket");
            }
        }






    }
}
