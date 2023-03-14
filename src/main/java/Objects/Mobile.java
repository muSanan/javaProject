package Objects;

public class Mobile {
    String model;
    int price;
    int memory;



    public void ring(){
        System.out.println(model + " ring can be sound/silent/shake");

    }

    public void turnOn(){
        System.out.println(price + " < 1000$ price and " + memory + " < 256Gb: hold the button for a long time");

    }

    public void  turnOff(){
        System.out.println(model + " if it is iphone: button turn off is not");

    }

    public static void main (String [] args){
        Mobile mobile1 = new Mobile();
        mobile1.model = "samsung galaxy A5";
        mobile1.price = 800;
        mobile1.memory = 180;

        mobile1.ring();
        mobile1.turnOn();
        mobile1.turnOff();

        Mobile mobile2 = new Mobile();
        mobile2.model = "iphone 14 PRO";
        mobile2.price = 1200;
        mobile2.memory = 256;

        mobile2.ring();
        mobile2.turnOn();
        mobile2.turnOff();

    }


}
