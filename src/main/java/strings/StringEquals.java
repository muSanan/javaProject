package strings;

public class StringEquals {
    public static void main (String [] args){
        String country1 = "FirstClasses.USA";
        String country2 = "FirstClasses.USA";
        String country3 = new String("FirstClasses.USA");

        System.out.println(country1 == country2);//true
        System.out.println(country1 == country3);//false
        System.out.println(country2 == country3);//false
        System.out.println(country1.equals(country3));//true








    }
}
