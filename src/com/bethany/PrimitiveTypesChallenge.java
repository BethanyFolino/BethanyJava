package com.bethany;

public class PrimitiveTypesChallenge {
    public static void main(String[] args){
        byte myByte = 30;
        short myShort = 2000;
        int myInt = 80000;
        long longTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}
