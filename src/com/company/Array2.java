//Write a program that does the following:
//
//        1.It creates a String array called "names", and the array is initialised with a size of four. In other words, create a String
//        array called "names" that can store four entries.
//        2.It stores the first names ‘Henry’ and ‘Shane’ in the first two entries.
//        3.It stores the last names ‘Sharma’ and ‘Watson’ in the next two entries.
//        4.It prints out, on separate lines, the first name + last name of the two names stored in the names array, e.g.

package com.company;

import java.util.*;

public class Array2 {
    public static void main(String[] args)
    {
        String[] name = {"Henry", "Shane", "sharma", "Watson"};
        System.out.println(name[0] + " " + name[2]);
        System.out.println(name[1] + " " + name[3]);
    }
}
