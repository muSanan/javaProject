package strings;

import java.util.Locale;

public class HomeworkPracticeAndEquals {
    public static void main(String[] args) {
        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("FirstClasses.HelloWorld!");
        System.out.println(!hello1.equals(hello2));
        System.out.println(hello1.equals(hello3));
        System.out.println(hello1.equals(hello2));
        System.out.println(hello1.toLowerCase().equals(hello2.toLowerCase()));
        System.out.println(hello1.toUpperCase().equals(hello3.toUpperCase()));





    }
}
