//Print first n integers starting from 0 in the reverse order using the for loop.
//        (n is an integer entered by the user)
//        Sample Input:
//        5
//        Sample Output
//        5
//        4
//        3
//        2
//        1
//        0

package com.company;

import java.util.*;

public class ReverseOrder {
    public static void main(String[] args)
    {
        int n,i;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(i=n;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}
