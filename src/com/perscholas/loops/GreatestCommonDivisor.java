package com.perscholas.loops;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st positive integer : "); // 16
        int n1 = input.nextInt();
        System.out.print("Enter 2nd positive integer : "); // 24
        int n2 = input.nextInt();

        int gcd = 1;
        for (int k = 2;(k<=n1 && k<=n2);k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        System.out.printf("The GCD of %d and %d is : %d" , n1,n2,gcd); // 8

    }
}

