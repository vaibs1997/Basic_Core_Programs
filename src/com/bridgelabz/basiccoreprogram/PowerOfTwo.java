package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        //Power of Two
        int num, result;
        int a=2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = in.nextInt();

        System.out.println("The numbers are: ");
        for(int i=0; i<num;i++){
            result = (int) Math.pow(a,i);
            System.out.println(result);
        }
    }
}
