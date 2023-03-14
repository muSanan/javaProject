package Loop;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++){

            if (i == 5){
                continue; // 5 is missed
            }
            System.out.println(i);
        }

        for (int x = 1; x <=100; x++){
            if (x % 2 ==0){
                continue;
            }
            System.out.println(x);
        }

        for (int j = 1; j <=100; j++){
            if (j%3 == 0){
                continue;
            }
            System.out.print(j + "\t");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number");
        int y = sc.nextInt();
        int w = sc.nextInt();

        for (int i = w; i <= y; i++){
            if (i % 2 == 0 && i < 0){
                continue;
            }else if (i % 2 != 0 && i > 0){
                continue;
            }
            System.out.print(i + "\t");
        }








    }
}
