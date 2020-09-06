//Write a program that prints the sum of first n numbers, where n is the input from the user. For e.g., if the user input is 10,
//        the output of the program should be 55.
//        Input:
//        10
//        Output:
//        55

package com.company;

import java.util.*;

public class SumOfNumbers {
    public static void main(String[] args)
    {
        int n,i,sum=0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(i=1;i<=n;i++)
        {
            sum += i;

        }
        System.out.println(sum);
    }
}
