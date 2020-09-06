//Write Java code to calculate the HCF or the greatest common divisor of two numbers. Once you've calculated the HCF of two
//        numbers, print out the HCF.
//
//        Hint: HCF is the highest number that divides two numbers. So your loop should start by checking if the lower of the two numbers
//        entered is the HCF and then check the numbers below, one by one until the HCF is found.
//
//        For e.g., if the numbers entered are 12 and 45, the output is 3.
//        Sample Input:
//        12 45
//        Output:
//        3

package com.company;

import java.util.*;

public class HCF {
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        int hcf = 1;
        for(int i=1; i <= n1 && i <= n2; i++)
        {
            if(n1%i==0 && n2%i==0)
            {
                hcf=i;
            }

        }
        System.out.println(hcf);
    }
}
