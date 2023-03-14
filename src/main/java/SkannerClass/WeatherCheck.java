package SkannerClass;

import java.util.Scanner;

public class WeatherCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter degree");
        double degree = scanner.nextDouble();
        System.out.println("raining? (yes/no)");
        boolean raining = scanner.nextBoolean();

        if (degree < 0){
            System.out.println("It's freezing outside! Wear a heavy coat, gloves, and a hat.");
        }
        else if (raining && degree >=0 && degree <= 10){
            System.out.println("It's chilly and rainy! Wear a raincoat, boots, and a scarf.");
        }
        else if (!raining && degree >=0 && degree <= 10){
            System.out.println("It's chilly outside! Wear a jacket, gloves, and a hat");
        }
        else if (raining && degree >=11 && degree <= 20){
            System.out.println("It's cool and rainy! Wear a light jacket, boots, and a scarf");
        }
        else if (!raining && degree >=11 && degree <= 20){
            System.out.println("It's cool outside! Wear a light jacket and comfortable shoes.");
        }
        else if (raining && degree >20){
            System.out.println("It's warm and rainy! Wear a light jacket, shorts, and sandals");
        }
        else if (!raining && degree >20){
            System.out.println("It's warm outside! Wear a t-shirt, shorts, and comfortable shoes.");
        }







    }
}
