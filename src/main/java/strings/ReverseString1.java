package strings;

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reversed = "";

        for (int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        System.out.println(reversed);
//=====================================================================








    }
}
