package Loop;

public class HomeworkForLoop {
    public static void main(String[] args) {
//1
        for (int i = 1; i <= 50; i++){
            if (i % 5 ==0){
                System.out.println(i);
            }
        }
//2
        for (int i = 2; i <= 20; i++){
            if (i % 2 ==0){
                System.out.println(i);
            }
        }
//3
        for (int i = 10; i >=1; i--){
            System.out.println(i);
        }
//4
        for (int i = 1; i <=10; i++){
            System.out.println(5 + " * " + i + " = " + 5*i);
        }
//5
        int count = 0;
        for (int i = 1; count < 20; i += 2){
                System.out.println(i);
                count++;
            }
        System.out.println("количество строк: " + count);
//6
        int sum = 0;
        int count1 = 0;
        for (int i = 2; count1 < 50; i+=2){
            count1++;
            sum = sum+2;
            }
        System.out.println("сумма: " + sum);
        System.out.println("количество строк: " + count1);
//7
        int number = 254;
        int sum1 = 0;
        for (int i = number; i > 0; i /= 10) {
            int digit = i % 10;
            sum1 += digit;
        }
        System.out.println("The sum of the digits of " + number + " is " + sum1 + ".");
//8
        for (int x = 6; x >= 1; x--){
            for (int y = x-1; y>=1; y--){
                System.out.print("*");
            }
            System.out.println();
        }
//9

        for (int i = 1; i <= 4; i++){
            for (int j = 1; j<=i; j++){
               System.out.print(i);
            }
            System.out.println();
        }




    }
}
