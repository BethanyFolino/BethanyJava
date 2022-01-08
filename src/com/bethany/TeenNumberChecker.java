package com.bethany;

public class TeenNumberChecker {
    public static void main(String[] args) {
        hasTeen(13, 29, 45);
        hasTeen(34, 99, 57);
        hasTeen(19, 18, 14);
        hasTeen(22, 16, 17);

        isTeen(12);
        isTeen(20);
        isTeen(18);
        isTeen(13);
    }

    public static boolean hasTeen(int first, int second, int third){
        if(first < 20 && first > 12 || second < 20 && second > 12 || third < 20 && third > 12) {
            System.out.println("There's at least one teen here!");
            return true;
        } else {
            System.out.println("No teens here.");
            return false;
        }
    }

    public static boolean isTeen(int one){
        if(one < 20 && one > 12){
            System.out.println("This is a teen!");
            return true;
        } else {
            System.out.println("This is not a teen!");
            return false;
        }
    }
}
