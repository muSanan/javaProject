package strings;

public class StringIndexOf {
    public static void main(String[] args) {

        String ad = "Buy two, get one for free!";
        int index = ad.indexOf('g');//9
        System.out.println(index);
        int index1 = ad.indexOf('t');//4
        System.out.println(index1);
        index = ad.indexOf('o', 7);
        index = ad.indexOf('o', 10+30-20);





    }
}
