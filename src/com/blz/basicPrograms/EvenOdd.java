package com.blz.basicPrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter the number");
        int num = sc.nextInt();
        if(num % 2==0){
            System.out.println(num + " Even");
        }else {
            System.out.println(num + " Odd");
        }
    }
}
