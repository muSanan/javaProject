package strings;

public class StringToLowerCase {
    public static void main(String[] args) {



        String word = "Hello everYONE! HOW ARE you doing";
        System.out.println(word);
        word = word.toLowerCase();// converts to Lower Case
        System.out.println(word);

        String word2 = "hello guis, I'm good. AND you?";
        System.out.println(word2);
        word2 = word2.toUpperCase();
        System.out.println(word2);

        String word3 = "Hello everyone";
        String word4 = "HELLO EVERYONE";



        System.out.println(word3.toUpperCase().equals(word4));//true
        System.out.println(word3.equals(word4.toLowerCase()));//true





    }
}
