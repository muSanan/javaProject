package ProblemSolving;

import IfElse.IfElseDay2;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {
        String str = "hello world";
        boolean isEmpty = true;
        if (!str.equals(" ")){
            isEmpty = false;
        }
        if (isEmpty){
            System.out.println("is empty");
        }else{
            System.out.println("Not empty");
        }

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if (word.isEmpty()){
            System.out.println("is empty");
        }else {
            System.out.println("not empty");
        }

        /* pseudocode;
        1. unscrew the bolts of wheel;
        2. take jack;
        3. lift car by jack;
        4. remove the wheel;
        5. put new wheel;
        6. tighten the bolts;
        7. lift down car;
        8. tighten over the bolts.
        */







    }
}
