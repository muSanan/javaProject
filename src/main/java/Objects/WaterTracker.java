package Objects;

public class WaterTracker {

    int total = 0;
    int waterForTheDay = 2000;

    public void addWater(int amount){//The addWater method should only accept positive integers as input.
        total = total + amount;
        if (amount < 0){
            System.out.println("Your input is negative. Please input positive number!");
        }
        System.out.println("Your input is accept");
    }

    public int getWaterIntake(){
        System.out.println("You are you consumed: " + total + " milliliters of water for the day");
        return total;
    }

    public String getStatus(){
        if (total >= waterForTheDay){
            System.out.println("You are hydrated!");
        }
        else {
            System.out.println("You need to drink more water.");
        }
        return "getStatus";
    }



    public static void main(String[] args) {

        WaterTracker user1 = new WaterTracker();
        WaterTracker user2 = new WaterTracker();

        user1.addWater(300);
        user1.addWater(500);
        user2.addWater(1000);
        user2.addWater(700);
        user2.addWater(400);

        user1.getWaterIntake();
        user2.getWaterIntake();

        user1.getStatus();
        user2.getStatus();







    }









}
