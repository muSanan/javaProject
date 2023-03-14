package IfElse;

public class IfElseDay2 {
    public static void main(String[] args) {

        int day = 8;
        if (day == 1){
            System.out.println("monday");
        }else if (day == 2){
            System.out.println("tuesday");
        }else if (day == 3){
            System.out.println("wednesday");
        }else if (day == 4){
            System.out.println("thursday");
        }else if (day == 5){
            System.out.println("friday");
        }else if (day ==6){
            System.out.println("saturday");
        }else if (day == 7){
            System.out.println("sunday");
        }else {
            System.out.println("invalid day");
        }

        String days = "TUESDAY";
        if (days.equalsIgnoreCase("monday")){
            System.out.println("1");
        }else if (days.equalsIgnoreCase("tuesday")){
            System.out.println("2");
        }else if (days.equalsIgnoreCase("wednesday")){
            System.out.println("3");
        }else if (days.equalsIgnoreCase("thursday")){
            System.out.println("4");
        }else if (days.equalsIgnoreCase("friday")){
            System.out.println("5");
        }else if (days.equalsIgnoreCase("saturday")){
            System.out.println("6");
        }else if (days.equalsIgnoreCase("sunday")){
            System.out.println("7");
        }

        byte time = 11;
        if (time >= 9 && time <= 17){
            System.out.println("WORK HOURS");
        }else if (time >= 7 && time < 9){
            System.out.println("COMMUTE HOURS");
        }else if (time >=6 && time <=8){
            System.out.println("BREAKFAST TIME");
        }else if (time >=12 && time <= 13){
            System.out.println("LUNCH TIME");
        }else if (time >= 20 && time <=22){
            System.out.println("DINNER TIME");
        }else if (time > 22 && time <= 24){
            System.out.println("LATE HOURS");
        }else if (time >= 0 && time <=6){
            System.out.println("SLEEP TIME");
        } else if (time >=18 && time <= 19){
            System.out.println("COMMUTE HOURS");
        } else {
            System.out.println("INVALID TIME");
        }









    }
}
