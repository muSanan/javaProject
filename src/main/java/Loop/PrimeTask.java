package Loop;

public class PrimeTask {
    public static void main(String[] args) {

        int number = 13;
        boolean isPrime = true;

        for (int i = 2; i < number; i++){
            if (number % i == 0){
            isPrime = false;
            break;
            }

        }
        if (isPrime){
            System.out.println("Is prime");
        }else {
            System.out.println("not prime");
        }

        boolean compare = false;
        System.out.println(compare);





    }
}
