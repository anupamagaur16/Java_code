//Write a function called ‘fizzBuzz’, that takes in an array of integers, and for each number in the array, if the
//        number is —
//        1) a multiple of three, it prints ‘Fizz’ (instead of the number).
//        2) a multiple of five, it prints ‘Buzz’ (instead of the number).
//        3) a multiple of both three and five, it prints ‘FizzBuzz’ (instead of the number).
//        4) otherwise, it simply prints the number.
//
//        For example, if the array is - 2 3 5 8 12 15 16
//        The output would be - 2 Fizz Buzz 8 Fizz FizzBuzz 16
//
//        Input:
//        No input required
//        Output:
//        1 2 34 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz

package com.company;

public class fizzBuzz {
    public static void main(String[] args)
    {
        int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        FizzBuzz1(numbers);
    }

    public static void FizzBuzz1(int[] numbers)
    {
        for ( int i = 0; i < numbers.length; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("FizzBuzz ");
            }
            else if(i % 3 == 0)
            {
                System.out.print("Fizz ");
            }
            else if(i % 5 == 0)
            {
                System.out.print("Buzz ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }

    }
}
