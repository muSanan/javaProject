package strings;

public class IntroToStrings {
    public static void main(String [] args){

        String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName);
        System.out.println(lastName);

        firstName = "Michael";
        System.out.println(firstName);

        lastName = "Smith";
        System.out.println(lastName);

        //===========================================================

        String myName = "Sanan";
        String myMiddleName = "-";
        String myLastName = "Muzraev";
        byte age = 36;
        String addres = "FirstClasses.Schaumburg, 216 Charleston Ct";
        int mobile = 630702939;
        String friendName = "John";
        String city = "FirstClasses.Schaumburg";
        char space = ' ';

        System.out.println(myName);
        System.out.println(myMiddleName);
        System.out.println(myLastName);
        System.out.println(age);
        System.out.println(addres);
        System.out.println(mobile);
        System.out.println(friendName);
        System.out.println(city);

        System.out.println(myName + " " + myLastName);

        System.out.println("My name is " + myName + space + myLastName);
        System.out.println("I am " + age + " years old");

        String fruit1 = "apple";
        String fruit2 = new String("banana");
//--------------------------------

        String city1 = "London";
        System.out.println(city1);

        String city2 = new String ("New York");
        System.out.println(city2);

        //================================================

        System.out.println(city1.length());//6
        System.out.println(city2.length());//8
        /*
        length показывает нам кол-во символов
        */
        String name = "Antananarivo";
        System.out.println("The length of Antananarivo is: " + name.length());

        System.out.println("Benazir");

        String school = "FirstClasses.Codewise";
        school = "FirstClasses.Codewise academy";
/*
equals method compares value of 2 Strings
 */
        String fruit3 = "apple";
        String fruit4 = "apple";
        String fruit5 = "Apple";

        boolean isSame = fruit3.equals(fruit4);
        System.out.println(isSame);
        isSame = fruit3.equals(fruit5);
        System.out.println(isSame);

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println(fruit1.equals(fruit2));

        boolean isSame2 = !fruit1.equals(fruit2);
        System.out.println(isSame2);


        int cucumber = 5;
        int tomato = 10;

        int empty = 0;
        cucumber = tomato;//10
        tomato = empty;//0
        empty = cucumber;


        System.out.println("cucumber; " + cucumber);
        System.out.println("tomato; " + tomato);

        //------------------------------

        int aa = 5;
        int bb = 10;
        int cc = bb;//10
        bb = aa;//5
        aa = cc;//10


        System.out.println("aa; " + aa);
        System.out.println("bb; " + bb);


        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";

        /*
        String state0 = state1;//California
                state2 = state0;//California
        boolean isEqual = state1 ==state2;
        System.out.println(isEqual);
         */
         boolean vv = (!state1.equals(state2));
         System.out.println(vv);

         boolean bbr = (state2.equalsIgnoreCase(state4));
         System.out.println(bbr);

         boolean bbb = (state3.equals(state5));
         System.out.println(bbb);

         boolean uuu = (state5.equals(state1));
         System.out.println(uuu);

         boolean ppp = (!state4.equals(state3));
         System.out.println(ppp);




























    }





}
