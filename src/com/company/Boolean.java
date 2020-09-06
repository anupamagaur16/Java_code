//Let’s say someone is booking an air ticket for himself and his brother. There is an offer that says that he will get a 20%
// discount if both he and his brother are less than 25 years old.
//        Write a code that prints ‘True’ if he is eligible for the offer and ‘False’ if he is not eligible.
//        Specifically, the program should —
//        Ask the user to enter his age
//        Ask the user to enter the age of his brother
//        Store the ages of the user and the user’s brother
//        Print "true" if the user is eligible for the discount or "false" if the user is not eligible for the discount
//        Please note that age has to be non- negative.
//        So, in case the user enters the age which is less than or equal to 0, the program should return false.

package com.company;

import java.util.*;

public class Boolean {
    public static void main(String[] args)
    {
        int myAge, brotherAge;
        Scanner input = new Scanner(System.in);
        myAge = input.nextInt();
        brotherAge = input.nextInt();
        boolean discount = (myAge < 25 && brotherAge < 25 && myAge > 0 && brotherAge > 0);
        System.out.println(discount);
    }
}
