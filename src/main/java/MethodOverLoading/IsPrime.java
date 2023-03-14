package MethodOverLoading;

public class IsPrime {

    public boolean primeNumber(int a){
       for (int i = 1; i < a; i++){
            if (a % i == 0){
                return false;
            }
        }
            return true;
    }

    public boolean primeNumber(short a){
        for (short i = 1; i < a; i++){
            if (a % i == 0){
                return false;
           }
        }
        return true;
    }

    public boolean primeNumber(long a){
                for (long i = 1; i < a; i++){
            if (a % i == 0){
                return false;
            }

        }
        return true;
    }






}
