package com.blz.basicPrograms;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int team;
        System.out.println("Enter the value of X and Y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("before swapping numbers: " + x + "  " + y);
        System.out.println("Value of x:" + x);
        System.out.println("Value of y:" + y);
        team = x;
        x = y;
        y = team;
        System.out.println("After swapping: " + x + "   " + y);
        System.out.println("Value of x:" + x);
        System.out.println("Value of y:" + y);
    }
}
