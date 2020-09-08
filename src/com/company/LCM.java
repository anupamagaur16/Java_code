//Write a function that takes two numbers as parameters and returns the LCM of these two numbers. So, if the values
//        passed into the function are 12 and 20, the function will return the lowest common multiple of these two, i.e 60.
//
//        Sample Input:
//        12
//        20
//        Output:
//        60

package com.company;

import java.util.*;

public class LCM {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println(LCMFunction(num1,num2));

    }

    public static int LCMFunction(int n1, int n2)
    {
        int lcm = 0;
        lcm = (n1 > n2) ? n1 : n2;
        while (true)
        {
            if(lcm % n1 == 0 && lcm % n2 == 0)
            {
                return lcm;
            }
            ++lcm;
        }
    }
}
