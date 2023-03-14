package arifmeticOperators;

public class CompoundOperators {
    public static void main (String [] arga){
        int a = 5;
        a++;//a=a+1
        a++;
        a++;
        System.out.println(a);//8

        a--;//a = a-1 / pre decrement
        System.out.println(a);//7
        --a;// post decrement

        int age = 18;
        System.out.println(age);//18

        System.out.println(age++);// post increment 18
        System.out.println(age);//19

        int price = 20;
        System.out.println(++price);//pre increment 21

        System.out.println(price++);//21
        System.out.println(price);//22

        int money = 20;
        money += 3;// money = money + 3

        System.out.println(money);//23

        money +=5;
        System.out.println(money);//28

        money *=2; //money = money*2
        System.out.println(money);//56

        money /= 4;
        System.out.println(money);//14

        money %=2;
        System.out.println(money);//0










    }
}
