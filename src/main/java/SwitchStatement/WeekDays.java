package SwitchStatement;

public class WeekDays {
    public static void main(String[] args) {
        int day = 7;
        switch (day){
            case 1,2,3,4,5:
                System.out.println("weekday");
                break;
            case 6,7:
                System.out.println("weekend");
                break;
        }
    //=================================


            char letter = 'A';

            switch (letter){
                case 'A','E','I','O','U':
                    System.out.println("Vowels");
                    break;
                default:
                    System.out.println("consonant");
                    break;
            }

















    }
}
