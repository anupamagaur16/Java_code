package com.company;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int base,exponent;
        long result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base value : ");
        base = input.nextInt();
        System.out.println("Enter the exponent value : ");
        exponent = input.nextInt();

        while(exponent !=0)
        {
            result *=base;
            --exponent;
        }

    }
}
