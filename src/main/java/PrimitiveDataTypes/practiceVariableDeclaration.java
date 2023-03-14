package PrimitiveDataTypes;

public class practiceVariableDeclaration {

    public static void main (String [] args){
        /*
        1. Declare variable (means create container)
        2. Assign value to variable (put value inside variable)
        3. Reassign value to variable (put new value to the same variable)
         */
        //single line comment

        byte myByte; //declare variable
        byte _another_byte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte);
        _another_byte = 100;
        System.out.println(_another_byte);
//-----------------------------------------------------

        short sh1 = 5000;
        sh1 = 5600;
        System.out.println(sh1);
        short sh2 = 12000;
        sh2 = 13000;
        System.out.println(sh2);
        short sh3 = 22000;
        sh3 = 23000;
        System.out.println(sh3);
        short sh4 = 27000;
        sh4 = -23000;
        System.out.println(sh4);
        short sh5 = 30000;
        sh5 = -30000;
        System.out.println(sh5);
//-----------------------------------------------

        int int1 = 1;
        int1 = 3;
        int int2;
        int2 = int1;
        int int3;
        int3 = 0;
        int int4 = 8;
        int int5 = int4;
        int int6 = 113;
        int int7 = -1123;
        int int8;
        int8 = int6;
        int int9 = int8;
        int int10 = int9;

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4);
        System.out.println(int5);
        System.out.println(int6);
        System.out.println(int7);
        System.out.println(int8);
        System.out.println(int9);
        System.out.println(int10);

//=========================================================
        /*
        - 2 147 000 000 to 2 147 000 000 range integer
         */

        long longNumber1 = 1;
        longNumber1 = -2000;

        long longNumber2 = 2147483649l;
        long longNumber3 = 2147483648l;
        longNumber2 = int3;//0
        System.out.println(longNumber2);

        /*



         */

        byte byteNumber = 0;
        short shortNumber = 0;
        int intNumber = 0;
        long longNumber = 333;

        shortNumber = byteNumber;
        intNumber = shortNumber;
        longNumber = intNumber;

        intNumber = (int)longNumber;
        shortNumber = (short)intNumber;
        System.out.println(intNumber);








    }


}
