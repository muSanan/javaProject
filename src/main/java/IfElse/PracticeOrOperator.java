package IfElse;

public class PracticeOrOperator {
    public static void main(String[] args) {
        String menu = "pizza lagman tea dread cake coffee water";
        if (menu.contains("pizza") && menu.contains("soda")){
            System.out.println("order pizza and soda");
        }
        if (menu.contains("tea") && menu.contains("cake")){
            System.out.println("order dessert");
        }
        if (menu.contains("lagman") && menu.contains("tea")){
            System.out.println("order lagman and tea, asian is here");
        }
        if (menu.contains("coffee") || menu.contains("smoothie")){
            System.out.println("breakfast time");
        }
        if (menu.contains("pizza") || menu.contains("pasta")){
            System.out.println("italian day");
        }
        if (menu.contains("tea") && menu.contains("coffee") && menu.contains("water") && menu.contains("soda")){
            System.out.println("order only drink");
        }
        if (menu.contains("lagman") && !menu.contains("plov")){
            System.out.println("not uzbek restaurant");
        }





    }
}
