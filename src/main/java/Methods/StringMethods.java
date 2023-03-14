package Methods;

public class StringMethods {

    static boolean compareStrings(String str1, String str2){
        if (str1.equals(str2)){
            return true;
        }
        return false;
    }

     static String Concantinated(String word1, String word2){
        return (word1+word2).toUpperCase();
    }

    static int length(String s1, String s2){
        return (s1+s2).length();
    }

    public static boolean isEven(int i){
        return i % 2 == 0;
    }

    public static boolean divisible10(int i){
        if (i % 10 ==0){
            return true;
        }
        return false;
    }

    public static void printMultiplicationTable(int a){
        for (int i = 1; i <= 10; i++){
            System.out.println(a + "*" + i + " = " + 5*i);
        }
    }

    public static int getLargest(int a, int b){
        if (a>b){
            System.out.println(a);
            return a;
        }
        System.out.println(b);
        return b;
    }

    public static int getAverage(int a, int b, int c, int d){
        return (a+b+c+d)/4;
    }

    public static int sumOfNumbers(int i){
        int sumOfNumbers = 0;
        for (int j = 1; j<=i; j++){
            sumOfNumbers += j;

        }
        return sumOfNumbers;
    }





    public static void main(String[] args) {
        boolean isSame = compareStrings("hello", "hello");
        System.out.println(isSame);
        compareStrings("buy", "hi");

        printMultiplicationTable(123);

        System.out.println(getAverage(2,5,6,7));
        System.out.println(sumOfNumbers(3));

    }









}
