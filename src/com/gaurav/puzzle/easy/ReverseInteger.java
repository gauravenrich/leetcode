package com.gaurav.puzzle.easy;

import java.util.Scanner;

/**
 * Reverse the Integer
 * @gauravenrich
 * 27th June 2021
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = s.nextInt();
        System.out.println("Reversed number is " + reverse(num));
    }

    private static int reverse(int num) {
        long res = 0;
        int negFlag = 1;
        if (num < 0) {
            negFlag = -1;
            num = num * -1;
        }

        while (num != 0) {
            res = res * 10 + num % 10;
            num = num / 10;
        }
        return (int) res * negFlag;
    }
}
