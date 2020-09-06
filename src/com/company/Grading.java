//Write a Java program to print a student’s grade based on his marks. You will take the student’s name and marks as input and
//        determine the grade based on the following:
//        Marks | Grade
//        >100 | A
//        >80 & <=100 | B
//        >60 & <=80 | C
//        >40 & <=60 | D
//        <=40 | E
//
//        Input format:
//        The first line will contain the name of the student and the second line will contain student's marks.
//        Output format:
//        The program should print:
//        The grade scored by <name> is <grade>
//
//        Sample Input:
//        Aishwarya
//        33
//        Sample Output:
//        The grade scored by Aishwarya is E


package com.company;

import java.util.*;

public class Grading {
    public static void main(String[] args)
    {
        String name;
        int marks;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        marks = input.nextInt();
        if(marks>100)
        {
            String grade = "A";
            System.out.println("The grade scored by " + name + " is " + grade);
        }
        else if(marks > 80 && marks <= 100)
        {
            String grade = "B";
            System.out.println("The grade scored by " + name + " is " + grade);
        }
        else if(marks > 60 && marks <= 80)
        {
            String grade = "C";
            System.out.println("The grade scored by " + name + " is " + grade);
        }
        else if(marks > 40 && marks <= 60)
        {
            String grade = "D";
            System.out.println("The grade scored by " + name + " is " + grade);
        }
        else if(marks <= 40)
        {
            String grade = "E";
            System.out.println("The grade scored by " + name + " is " + grade);
        }
        else
        {
            System.out.println("Enter the valid number...");
        }
    }
}
