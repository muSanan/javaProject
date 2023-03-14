package Objects;

public class Calculator {

    int x;
    int y;
    String sign;

    public int add(int x, int y){
       int sum = x + y;
        System.out.println(x + " + " + y + " = " + sum);
      return sum;
    }

    public int substract(int x, int y){
        int substract = x - y;
        System.out.println(x + " - " + y + " = " +substract);
        return substract;
    }

    public int multiply(int x, int y){
        int multiply = x * y;
        System.out.println(x + " * " + y + " = " + multiply);
        return multiply;
    }

    public double divide(int x, int y){
        double divide = x / y;
        System.out.println(x + " / " + y + " = " + divide);
        return divide;
        }



    public int modulus(int x, int y){
        int modulus = x % y;
        System.out.println(x + " % " + y + " = " + modulus);
        return modulus;
    }

    public int factorial(int x){
        int factorial = 0;
        for (int i = 1; i <= x; i++){
            factorial+=i;
        }
        System.out.println("factorial of " + x + " = " + factorial);
        return factorial;
    }

    public double squareRoot(int x){
        double squareRoot = Math.sqrt(x);
        System.out.println("Square root of " + x + " = " + squareRoot);
        return squareRoot;
    }

    public static void main(String[] args) {
        Calculator one = new Calculator();

        one.add(10,5);
        one.substract(25,5);
        one.multiply(33,3);
        one.divide(51,7);
        one.modulus(177,4);
        one.factorial(6);
        one.squareRoot(36);








    }




}
