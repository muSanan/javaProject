package Objects;

public class Zoo {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.type = "tiger";
        animal1.isMammal = true;
        animal1.isCarnivare = true;
        animal1.habitat = "India";
        animal1.age = "3";

        animal1.eat();
        animal1.play();
        animal1.sleep();

        Animal animal2 = new Animal();
        animal2.type = "zebra";
        animal2.isMammal = true;
        animal2.isCarnivare = false;
        animal2.habitat = "Africa";
        animal2.age = "2";

        animal2.eat();
        animal2.play();
        animal2.sleep();




    }
}
