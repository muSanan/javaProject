package Methods;

public class IntrotoMethods {

    static void voidMethod(){
        /*

         */
    }

   static int sum(int a, int b){
        return a+b;
    }



    int getPerimeterRectangle(int length, int width){
        return 2*length + 2*width;
    }

    static  int getLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        IntrotoMethods intro = new IntrotoMethods();
        System.out.println(intro.getPerimeterRectangle(5,4));

        int length = getLength("hello");
        System.out.println(length);

    }





}
