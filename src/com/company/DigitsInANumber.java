//Write a Java program to count the number of digits in a number entered by the user.
//        Hint: You can use the "/" operator here.
//        Sample Input:
//        123455
//        Sample Output:
//        6

package com.company;

import java.util.*;

public class DigitsInANumber {
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int count=0;
        while (n!=0)
        {
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
