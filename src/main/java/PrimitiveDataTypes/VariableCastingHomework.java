package PrimitiveDataTypes;

public class VariableCastingHomework {
    public static void main (String [] args){
        byte myByte = 3;
        short myShort = 22;
        int myInt = 9111;
        long myLong = 888888888888888l;
        float myFloat = 6307029396.999f;
        double myDouble = 6307029396.999;

        myByte = (byte) myShort;
        myByte = (byte) myInt;
        myByte = (byte) myLong;
        myByte = (byte) myFloat;
        myByte = (byte) myDouble;

        System.out.println(myByte);
        System.out.println(myDouble);

        myShort = myByte;
        myShort = (short) myInt;
        myShort = (short) myLong;
        myShort = (short) myFloat;
        myShort = (short) myDouble;

        myInt = myByte;
        myInt = myShort;
        myInt = (int) myLong;
        myInt = (int) myFloat;
        myInt = (int) myDouble;

        myLong = myByte;
        myLong = myShort;
        myLong = myInt;
        myLong = (long) myFloat;
        myLong = (long) myDouble;

        myFloat = myByte;
        myFloat = myShort;
        myFloat = myInt;
        myFloat = myLong;
        myFloat = (float) myDouble;

        myDouble = myByte;
        myDouble = myShort;
        myDouble = myInt;
        myDouble = myLong;
        myDouble = myFloat;












    }


}
