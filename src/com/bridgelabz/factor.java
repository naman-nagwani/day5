/*
Factors
a. Desc -> Computes the prime factorization of N using brute force.
b. I/P -> Number to find the prime factors
c. Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P -> Print the prime factors of number N.
*/

package com.bridgelabz;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        int n,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number to find prime factors of");
        n = scan.nextInt();
        temp=n;

        for (int i = 2; i * i <= n; i++) {

            while (temp%i==0){
                System.out.println(i);
                temp=temp/i;
            }
        }
    }
}
