//Write a program to print n multiples of x, where n and x are integers entered by the user.
//        The first line of input will contain x and the second line will have n.
//
//        Sample Input:
//        2
//        4
//        Sample Output:
//        2
//        4
//        6
//        8

package com.company;

import java.util.*;

public class NMultiples {
    public static void main(String[] args)
    {
        int n,x,i;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        n = input.nextInt();
        for(i=1;i<=n;i++)
        {
            int result=i*x;
            System.out.println(result);
        }
    }
}

