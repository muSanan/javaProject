package strings;

public class PractiseStrings {
    public static void main(String[] args) {
        String singerName = "Michael Jackson";
        System.out.println(singerName.length());//return numbers of chars

        System.out.println(singerName.endsWith("on"));//true
        System.out.println(singerName.startsWith("Misha"));//false
        System.out.println(!singerName.isEmpty());//true
        System.out.println(singerName.toLowerCase());// michael jackson
        System.out.println(singerName);//Michael Jackson

        singerName = singerName.toUpperCase();
        System.out.println(singerName);// MICHAEL JACKSON

        System.out.println(singerName.charAt(0));

        System.out.println("" + singerName.charAt(0)+singerName.charAt(3));//Mh

        System.out.println(singerName.indexOf("C"));//2
        System.out.println(singerName.indexOf('C',3));
        System.out.println(singerName.indexOf("W"));//-1

        String singerName2 = "Justin Bieber";

        boolean areTheySame = singerName2.equals(singerName);//false
        System.out.println(areTheySame);

        System.out.println(!singerName.equals(singerName2));//true

        singerName = singerName2;
        System.out.println(singerName.equals(singerName2));//true
        System.out.println(singerName == singerName2);//true
















    }
}
