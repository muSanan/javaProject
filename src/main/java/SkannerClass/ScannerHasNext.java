package SkannerClass;

import java.util.Scanner;

public class ScannerHasNext {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean b = scanner.hasNext();
        System.out.println(b);

    }
}
