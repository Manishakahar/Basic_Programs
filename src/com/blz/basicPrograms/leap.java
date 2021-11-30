package com.blz.basicPrograms;

import java.util.Scanner;

class Leap {
    public static void main(String[] args) {
        System.out.println("Enter a 4 digit number: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year > 999 && year < 10000) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Given year is a leap year");
            } else {
                System.out.println("Given year is not a leap year");
            }
        } else {
            System.out.println("Enter a valid year");
        }
    }
}
