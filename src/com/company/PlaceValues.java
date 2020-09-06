//Write a code below that takes a 5-digit positive number from the user as an input.
//
//        For example, you can take 34768 as an input. The program should print the numbers in the ones, tens, hundreds, thousands, and
//        ten thousands places of the 5-digit number the user inputs.

package com.company;

import java.util.*;

public class PlaceValues {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int tenThousands = 0, thousands = 0, hundreds = 0, tens = 0, ones = 0;
        int number = input.nextInt();
        if(number > 99999)
        {
            System.out.println("\nError! Number more than 5 digits.");
        }
        else if(number < 10000)
        {
            System.out.println("\nError! Number less than 5 digits.");
        }
        else if(number >= 10000 && number <= 99999)
        {
            tenThousands = number / 10000;
            System.out.println(tenThousands);

            thousands = (number / 1000) % 10;
            System.out.println(thousands);

            hundreds = (number / 100) % 10;
            System.out.println(hundreds);

            tens = (number / 10) % 10;
            System.out.println(tens);

            ones = number % 10;
            System.out.println(ones);
        }
    }
}
