package com.bethany;

public class LeapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(-1200);
        isLeapYear(10000);
        isLeapYear(1990);
        isLeapYear(2004);
        isLeapYear(2016);
        isLeapYear(2020);
    }

    public static boolean isLeapYear(int year) {
        boolean leap = false;
        if(year < 1 || year > 9999){
            leap = false;
        } else if(year % 4 == 0 && year % 100 != 0){
            leap = true;
        } else if(year % 400 == 0){
            leap = true;
        }
        System.out.println(leap);
        return leap;
    }
}
