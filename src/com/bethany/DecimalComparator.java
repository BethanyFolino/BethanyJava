package com.bethany;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(1.0, 1.0);
        areEqualByThreeDecimalPlaces(3.234, 3.243);
        areEqualByThreeDecimalPlaces(5.251, 5.252);
        areEqualByThreeDecimalPlaces(7.66, 7.66);
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int thousandsFirst = (int) (first * 1000);
        int thousandsSecond = (int) (second * 1000);

        if (thousandsFirst == thousandsSecond) {
            System.out.println(first + " is equal to " + second + " by three decimal places");
            return true;
        } else {
            System.out.println(first + " is not equal to " + second + " by three decimal places");
            return false;
        }
    }
}
