package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);
        int totalSum = scanner.nextInt();
        int countFriends = scanner.nextInt();

        if (totalSum < 0){
            System.out.println("Bill total amount cannot be negative");
        } else if (countFriends <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            totalSum = (int) (totalSum * 1.1);
            totalSum = totalSum / countFriends;
            System.out.println(totalSum);
        }
    }
}
