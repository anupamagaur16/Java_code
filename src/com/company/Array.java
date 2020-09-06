//Write a Java program to take the marks of students from roll numbers 0 to 4 and store them in an array. After storing the marks,
// print the marks of the student with roll number 4.
//        Sample Input:
//        10
//        11
//        12
//        13
//        14
//        Sample Output:
//        14

package com.company;

import java.util.Scanner;

public class Array {
    public static void main(String[] args)
    {
        int marks[];
        marks = new int[5];
        Scanner input = new Scanner(System.in);
        marks[0] = input.nextInt();
        marks[1] = input.nextInt();
        marks[2] = input.nextInt();
        marks[3] = input.nextInt();
        marks[4] = input.nextInt();
        System.out.println(marks[4]);
    }
}
