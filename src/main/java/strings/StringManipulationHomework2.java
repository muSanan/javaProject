package strings;

import java.util.Locale;

public class StringManipulationHomework2 {
    public static void main(String[] args) {
//1
        String hi = "Hello world";
        int index = hi.indexOf('w');
        System.out.println(index);
//2
        String word = "Hello";
        System.out.println(word.charAt(0));
//3
        String word1 = "HELLO";
        System.out.println(word1.toLowerCase());
//4
        String word3 = "hello";
        System.out.println(word3.toUpperCase());
//5
        System.out.println(word3.equals(word));
//6
        String sentence = "the quick brown fox";
        System.out.println(sentence.toUpperCase().charAt(0) + " " + sentence.toUpperCase().charAt(4) + " " + sentence.toUpperCase().charAt(10) + " " + sentence.toUpperCase().charAt(16));
//7
        System.out.println(word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + "" + word.charAt(0));
//8
        String a = "Hello world";
        String b = a.charAt(1) + "" + a.charAt(4) + "" + a.charAt(7);
        System.out.println(b.length());
//9
        String h = "Hello";
        String w = "world";
        System.out.println(h.concat(w));
//10
        String h1 = "hello";
        String h2 = "HELLO";
        System.out.println(h1.equalsIgnoreCase(h2));
//11
        System.out.println(a.length());
//12
        System.out.println(h.charAt(3));
//13
        System.out.println(a.indexOf('l'));
//14
        String h3 = "hello";
        String h4 = "hello";
        System.out.println(h3==h4);
        System.out.println(h3.equals(h4));
//15
        System.out.println(h1==h2);
        System.out.println(h1.equals(h2));
//16
        String s = "HELLO WORLD";
        System.out.println(s.toLowerCase());
//17
        String s1 = "hello world";
        System.out.println(s1.toUpperCase());
//18
        System.out.println(s1.replace('l','r'));
//19 this task is the same task #6













    }
}
