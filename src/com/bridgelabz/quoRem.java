/*Java Program to Compute Quotient and Remainder*/

package com.bridgelabz;

import java.util.Scanner;

public class quoRem {

    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        a = scan.nextInt();
        System.out.println("Enter any number");
        b = scan.nextInt();

        System.out.println("Quotient : "+(float)(a/b));
        System.out.println("Remainder : "+(a%b));
    }

}
