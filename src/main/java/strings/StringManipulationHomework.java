package strings;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";
        System.out.println("The character at position 10 is " + message.charAt(10));
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        System.out.println(message.charAt(5-1));
        System.out.println(message.charAt(message.length()-1));
        System.out.println(message.toLowerCase().charAt(0));
        System.out.println(message.toUpperCase().charAt(45));



    }
}
