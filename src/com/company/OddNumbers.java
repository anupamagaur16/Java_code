//Write a program that prints all the odd numbers from 25 to 1 (in decreasing order).
//        Output:
//        25 23 21 19 17 15 13 11 9 7 5 3 1

package com.company;

import java.util.*;

public class OddNumbers {
    public static void main(String[] args)
    {
        int n = 25;
        while(n>=1)
        {
            System.out.print(n+" ");
            n -=2;
        }
    }
}
