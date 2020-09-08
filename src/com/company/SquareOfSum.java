//Write a program that takes two numbers as input and returns the square of their sum.
//        For e.g., if the input numbers - 4 and 9 are passsed as parameters into the function, it should return  169,
//        which is  (4+9)2
//
//        Sample Input:
//        4
//        9
//        Output:
//        169

package com.company;

import java.util.*;

public class SquareOfSum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println(Square(num1,num2));
    }

    public static int Square(int n1,int n2)
    {
        int sum = n1 + n2;
        return sum * sum;
    }
}
