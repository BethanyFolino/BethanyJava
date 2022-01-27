package com.bethany;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        getDaysInMonth(1, 1990);
        getDaysInMonth(2,2020);
        getDaysInMonth(2, 2022);
        getDaysInMonth(3, 2003);
        getDaysInMonth(4, 2015);
        getDaysInMonth(5, 2007);
        getDaysInMonth(6, 1985);
        getDaysInMonth(7, 1972);
        getDaysInMonth(8, 1964);
        getDaysInMonth(9, 1929);
        getDaysInMonth(10, 1942);
        getDaysInMonth(11, 1994);
        getDaysInMonth(12, 2011);
        getDaysInMonth(13, 2000);
        getDaysInMonth(-1, 1938);
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

    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (year > 9999 || year < 0) {
                    days = -1;
                } else {
                    days = 31;
                }
                break;
            case 2:
                if (!isLeapYear(year)){
                    if (year > 9999 || year < 0) {
                        days = -1;
                    } else {
                        days = 28;
                    }
                } else if (isLeapYear(year)) {
                    if (year > 9999 || year < 0) {
                        days = -1;
                    } else {
                        days = 29;
                    }
                }
                break;
            case 4: case 6: case 9: case 11:
                if (year > 9999 || year < 0) {
                    days = -1;
                } else {
                    days = 30;
                }
                break;
            default:
                days = -1;
        }
        System.out.println(days);
        return days;
    }
}
