package com.bridgelabz.basiccoreprogram;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        // Flip Coin & Print Percentage of Head and Tails
        int tail=0, head=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin: ");
        int num  = in.nextInt();

        for(int i=0;i<num;i++){

            int num1 = (int) Math.floor(Math.random() * 2);

            if(num1 < 0.5)
                tail +=1;
            else
                head +=1;
        }

        int headPercentage = head * 100 / num;
        int tailPercentage = tail * 100 / num;

        System.out.println("Percentage of Head: " + headPercentage + " & Percentage of Tail: " + tailPercentage);

    }
}
