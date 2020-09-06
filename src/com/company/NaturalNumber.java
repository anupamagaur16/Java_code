//Write a program to print numbers from 1 to n, where n is a number taken as input from the user.
//
//        Sample Input:
//        4
//        Sample Output:
//        1
//        2
//        3
//        4

package com.company;

import java.util.*;

public class NaturalNumber {
    public static void main(String[] args) {
        int num, i;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
