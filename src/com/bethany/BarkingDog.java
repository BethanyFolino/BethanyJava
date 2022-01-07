package com.bethany;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(false,-1);
        shouldWakeUp(false, 24);
        shouldWakeUp(true, 4);
        shouldWakeUp(true,23);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            System.out.println(barking);
            return false;
        } else if(barking && hourOfDay < 8 || hourOfDay > 22) {
            System.out.println(barking);
            return true;
        }
        return false;
    }
}
