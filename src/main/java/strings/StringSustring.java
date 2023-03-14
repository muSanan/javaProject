package strings;

import java.util.Locale;

public class StringSustring {
    public static void main(String[] args) {
        String message = "Hello FirstClasses.Chicago, why are you cold and windy?";
        String city = message.substring(6,13);
        System.out.println(city);
        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to FirstClasses.USA, our population is 140 million people, " + "the average salary is 90k dollars, and our president Joe Byden";

        String country = welcomeSign.substring(welcomeSign.indexOf("U"), welcomeSign.indexOf("A") + 1);
        System.out.println(country);

        String population = welcomeSign.substring(welcomeSign.indexOf("140"), welcomeSign.indexOf(" people"));
        System.out.println(population);

        String salary = welcomeSign.substring(welcomeSign.indexOf("9"), welcomeSign.indexOf(", and"));
        System.out.println(salary);
        //найти президента

        String phrase = "Just one positive thought in the morning can change your whole day.";
        String thought = phrase.substring(phrase.indexOf("J"), phrase.indexOf("t") + 1) + " a " + phrase.substring(phrase.indexOf("th"), phrase.indexOf(" in"));
        System.out.println(thought);

        String morning = phrase.substring(9,18) + phrase.substring(33,40);
        System.out.println(morning);

        String morning1 = phrase.substring(57,62) + " " + phrase.substring(33,40);
        System.out.println(morning1);

        String day = phrase. substring(45,51) + " " + phrase.substring(5,8) + " " + phrase.substring(63,66);

        System.out.println(day);

        int beginIndex = phrase.indexOf("positive");
        int endIndex = phrase.indexOf(" thought");
        System.out.println(phrase.substring(beginIndex,endIndex));

        //=============================================================

        String str = "hi";
        String str2 = "bye";
        System.out.println(str + str2 + str + str2);
        System.out.println(str + " " + str2 + " " + str.toUpperCase() + " " + str.toUpperCase()+ " " + str2.toUpperCase() + " " + str2.toUpperCase() + " " + str2 + " " + str);
        System.out.println(str2.substring(0,1) + str.substring(1));
        System.out.println(str.replace('h','b'));
        System.out.println(str2.charAt(0) + " " + str.charAt(1));

        String see = "see";
        String hear = "hear";
        System.out.println(hear.replace('h','s'));
        System.out.println(see.substring(0,1) + hear.substring(1,4));
        //System.out.println(see.charAt(0) + hear.substring(1,4);

        String thinking = "we have to more hear than speak";
        System.out.println(thinking.substring(10));











    }
        
        
}