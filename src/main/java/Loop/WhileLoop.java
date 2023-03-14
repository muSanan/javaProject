package Loop;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }


        while (i<=100){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }

        for (int j = 1; j <=10; j++){
            System.out.println("good morning everyone");
            }

        int a = 1;
        while (a<=10){
            System.out.println("good morning");
            a++;
        }
        int b = 100;
        while (b >=0){
            if (b % 2 !=0){
                System.out.println(b);
            }
            b--;
        }

        for (int e = 100; e >=0; e--){
            if (e % 2 != 0){
                System.out.println(e);
            }
        }

        int m = 1;
        while (m <=31){
            System.out.println(m + " january 2023");
            m++;
        }

        boolean isPrime = true;
        int y=11;
        int x=2;
        while (x < y){
            if (y % x == 0){
                isPrime = false;
            }
            x++;
        }
        if (isPrime){
            System.out.println("is Prime");
        }else {
            System.out.println("not Prime");
        }





    }

}
