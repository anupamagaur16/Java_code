//Write Java code for a person to cast a vote against three possible candidates.
//        The code should first check if the person’s age is above or equal to 18 and print “You are not eligible” if the person
//        is less than 18.
//        There are three possible candidates:
//        Ram
//        Shyam
//        Ghanshyam
//        You should take the number as input and display “You have voted for <name>”.
//        The first line of input will contain the person’s age and the second line would contain a number which represents the candidate a person wants to vote for.
//        Sample input
//        18
//        1
//
//        Sample Output
//        You have voted for Ram

package com.company;

import java.util.*;

public class VotingMachine {
    public static void main(String[] args)
    {
        int age, vote;
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        vote = input.nextInt();
        if(age>=18)
        {
            switch(vote)
            {
                case 1:
                    System.out.println("You have voted for Ram");
                    break;
                case 2:
                    System.out.println("You have voted for Shyam");
                    break;
                case 3:
                    System.out.println("You have voted for Ghanshyam");
                    break;
                default:
                    System.out.println("Enter the correct choice...");
            }
        }
        else
        {
            System.out.println("You are not eligible");
        }
    }
}


//if (age>=18)
//{
//        if (vote==1)
//            System.out.println("You have voted for Ram");
//        if (vote==2)
//            System.out.println("You have voted for Shyam");
//        if (vote==3)
//            System.out.println("You have voted for Ghanshyam");
//}
//else
//{
//        System.out.println("You are not eligible");
//}