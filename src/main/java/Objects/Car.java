package Objects;

public class Car {
    String model;
    String year;
    String price;
    String colour;


    public void drive(){
        System.out.println(model + " is model");
        System.out.println(colour + " colour");

    }

    public void stop(){
        System.out.println(year + " how old");


    }

    public void playMusic(){
        System.out.println(price + " how much");

    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "toyota camry";
        car1.year = "2020";
        car1.price = "10 000$";
        car1.colour = "white";
        car1.stop();
        car1.drive();
        car1.playMusic();


        Car car2 = new Car();
        car2.model = "bmw 5";
        car2.year = "2022";
        car2.price = "12 000$";
        car2.colour = "black";
        car2.stop();
        car2.drive();
        car2.playMusic();





    }





}
