package strings;

public class PractiseSubstring {
    public static void main(String[] args) {
        String first_name = "Jacob";
        String lastName = "Coffee";

        String name1;
        name1 = first_name.charAt(0) + lastName.substring(4,6);
        System.out.println(name1);

        String name2 = lastName.charAt(0) + lastName.substring(4,6);
        System.out.println(name2);

        String name3 = first_name.substring(0,3) + lastName.substring(4,6);
        System.out.println(name3);

        System.out.println(lastName.substring(0,2) + first_name.charAt(4));

        System.out.println(lastName.toUpperCase().charAt(2) + lastName.substring(4,6) + first_name.substring(2,4));










    }
}
