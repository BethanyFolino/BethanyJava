package com.bethany;

public class Switch {
    public static void main(String[] args) {
        int value = 3;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                System.out.println("It was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        char charValue = 'F';

        switch(charValue) {
            case 'A':
                System.out.println("A found");
                break;

            case 'B':
                System.out.println("B found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " found");
                break;

            default:
                System.out.println("404: A, B, C, D, or E not found");
                break;
        }

        String month = "january";
        switch(month.toUpperCase()) {
            case "JANUARY":
                System.out.println("Jan");
                break;
            case "JUNE":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
