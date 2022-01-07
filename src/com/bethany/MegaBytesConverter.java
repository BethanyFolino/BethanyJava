package com.bethany;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int leftoverKilos = kiloBytes % 1024;
        int megaBytes = kiloBytes / 1024;
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + leftoverKilos + " KB");
        }
    }
}
