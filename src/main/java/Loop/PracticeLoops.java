package Loop;

public class PracticeLoops {
    public static void main(String[] args) {

        for (int x = 10; x >= 1; x--){
            System.out.println("value of x is: " + x);
        }

        for (int y = 10; y >= 0; y -=2){
            System.out.println("value of y is: " + y);
        }

        for (int num = 1; num<=15; num +=2){
            System.out.println("value of num is: " + num);
        }
       int sum = 0;
        for (int q = 1; q <=10; q++){
            System.out.println("value of i is:" + q);
            sum = sum + q;
        }
        System.out.println("sum of first 10 numbers is: " + sum);

        int sum1 = 0;
        for (int i = 0; i <= 100; i+=2){
            System.out.println("value of i is: " + i);
            sum1 = sum1 + i;
        }

        System.out.println("sum numbers is: " + sum1);







    }
}
