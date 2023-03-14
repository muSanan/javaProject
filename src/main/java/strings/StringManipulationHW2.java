package strings;

public class StringManipulationHW2 {
    public static void main(String[] args) {
        String sentence = "Long path starts with first small step";
//1
        System.out.println(sentence.endsWith("tep"));
//2
        System.out.println(sentence.substring(4,9));
//3
        System.out.println(sentence.replace("path","step"));
//4
        System.out.println(sentence.substring(21,27));
//5
        System.out.println(sentence.length()-1);
//6
        System.out.println(sentence.startsWith("long"));
//7
        System.out.println(sentence.substring(0,4) + sentence.substring(4,9).replace('p','m') + " " + sentence.substring(10,38));
//8
        System.out.println(sentence.indexOf('s') + 5);
//9
        System.out.println(sentence.replace(" ",""));
//10
        System.out.println(sentence.toUpperCase());

    }
}
