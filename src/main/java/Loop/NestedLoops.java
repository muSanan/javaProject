package Loop;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=6; i++){
            for (int j = 1; j <=(6-i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int e = 1; e <=10; e++){
            System.out.println(e);
        }

        for (int n = 1; n <= 10; n++){
            for (int m = 1; m<=10; m++){
                System.out.print(n*m + "\t");
            }
            System.out.println();
        }






    }
}





