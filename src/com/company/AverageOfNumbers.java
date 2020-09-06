//Take n integers as input and print their average.
//        The input will be in the following format:
//        The first line will contain n which is the number of integers to be taken average of.
//        The next n lines will contain n integers.
//        Average of n numbers= Sum of numbers/n
//        Note :The average must be of type int
//        Sample Input:
//        2
//        3
//        7
//        Sample Output:
//        5

package com.company;

import java.util.*;

public class AverageOfNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        int[] a = new int[n];
        int sum=0,number;
        for(int i=0;i<n;i++)
        {
            number = input.nextInt();
            sum = sum+number;
        }

        int average;
        average = sum/n;
        System.out.println(average);
    }
}
