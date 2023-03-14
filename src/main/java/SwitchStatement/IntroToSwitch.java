package SwitchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {

        int num = 8;
        switch (num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("INVALID NUMBER");
        }


        //====================================================================
        String digit = "three";

        switch (digit){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            default:
                System.out.println("invalid number");
        }

//=============================================================

        String number = "three";

        if (number.equals("one")){
            System.out.println(1);
        }else if (number.equals("two")){
            System.out.println(2);
        }else if (number.equals("three")){
            System.out.println(3);
        }else if (number.equals("four")){
            System.out.println(4);
        }else if (number.equals("five")){
            System.out.println(5);
        }else {
            System.out.println("invalid number");
        }















    }
}
