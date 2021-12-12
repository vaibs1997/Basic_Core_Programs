package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }

        if (num > 2) {
            System.out.print(num);
        }
    }
}
