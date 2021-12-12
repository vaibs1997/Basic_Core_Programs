package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        // Program to Compute Power of 2

        int num, result;
        int a = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = scanner.nextInt();

        System.out.println("The numbers are: ");
        for(int i = 0; i < num; i++){
            result = (int) Math.pow(a,i);
            System.out.println(result);
        }

    }
}
