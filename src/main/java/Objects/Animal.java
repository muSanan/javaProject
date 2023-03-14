package Objects;

public class Animal {
    String type;
    boolean isMammal;
    boolean isCarnivare;
    String age;
    String habitat;

    public void eat(){
        System.out.println(type + ": name of animal");
        System.out.println(isMammal + ": is mammal?");

    }

    public void sleep(){
        System.out.println(isCarnivare + ": is carnivare?");

    }

    public void play(){
        System.out.println(age + ": how old");
        System.out.println(habitat + ": where is live");
    }








}
