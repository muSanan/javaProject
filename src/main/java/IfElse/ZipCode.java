package IfElse;

import java.util.Scanner;

public class ZipCode {
    public static void main(String[] args) {

        String zipCode = "7846647";
        if (zipCode.length() != 5 || zipCode.contains("9") || zipCode.startsWith("0")){
            System.out.println("zipcode is invalid");
        }else {
            System.out.println("zipcode is valid");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 digits");
        int zip = scanner.nextInt();
        String zipCodes = zip+"";






    }
}
