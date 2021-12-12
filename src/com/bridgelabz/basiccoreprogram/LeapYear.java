package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Program to Compute Leap Year

        System.out.println("Enter the Year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Given Year is Leap Year");
        }else {
            System.out.println("Given Year is not Leap Year");
        }

    }
}
