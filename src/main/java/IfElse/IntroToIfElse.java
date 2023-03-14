package IfElse;

public class IntroToIfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("I will compare a and below");

        if (a>b){
            System.out.println("a is more than b");
        }else {
            System.out.println("a is less than b");
        }


        System.out.println("I already compared a and b");

        int number1 = 10;
        int number2 = 50;

        if (number1 / number2 == 2){
            System.out.println("YES, two!");
        }else {
            System.out.println("NOT, two!");
        }

        String elon = "Tesla SpaceX Paypal Twitter";
        if (elon.contains("Paypal")){
          System.out.println("Elon owned Paypal");
        }else {
            System.out.println("Elon did not owned Paypal");
        }

        int x = 155;
        int y = 111;
        if (x > y){
            System.out.println("Good job!");
        }else {
            System.out.println("Bad job, try again");
        }
        if (x == y){
            System.out.println("So so, but you can do that better");
        }else {
            System.out.println("Bad job, try again");
        }

        String instruction = "Dad, mom, brother";
        if (instruction.contains("Dad")){
            System.out.println("Open the door");
        }else {
            System.out.println("Don't open the door");
        }

        String instruction1 = "yellow, red, green";
        if (instruction1.endsWith("en")){
            System.out.println("you can buy it");
        }else {
            System.out.println("Not buy");
        }










    }
}
