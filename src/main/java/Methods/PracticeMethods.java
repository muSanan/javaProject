package Methods;

public class PracticeMethods {

    public static int multiplication(int a, int b){
        return a*b;
    }

    public String lowercase(String word){
        word = word.toLowerCase();
        return word;
    }

    public double division(int a, int b){
        return a/b;
    }

    static boolean palindrome(String word){
        boolean isPalindrome = true;
        for (int i = 0; i < word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length()-i-1)){
                isPalindrome = false;
            }
            return true;
        }
        return false;
    }

    double multiplicationBy100(double a){
        return 100*a;
    }

    static boolean consonant(char a){
        if (a != 'a' && a != 'o' && a != 'e' && a != 'i' && a != 'u'){
            return true;
        }
        return false;
    }

    public boolean difference(int a, int b){
        if (a-b == 5 || a-b == -5){
            return true;
        }
        return false;
    }

    boolean validEmail(String email){
        if (email.contains("@") && email.contains(".")){
            return true;
        }
        return false;
    }

    public boolean prime(int a){
        boolean prime = true;
        for (int i = 1; i < a; i++){
            if (a % i == 0){
                prime = false;
                break;
            }
            return true;
        }
        return false;
    }

    static boolean sameParity(int a, int b){
        if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)){
            return true;
        }
        return false;
    }







}
