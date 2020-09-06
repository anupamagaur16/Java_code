package com.company;

public class Swapping {

    public static void main(String[] args)
    {
        int a = 1, b = 2, c;
        System.out.println("Before Swapping");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        c = b;                             // c = 2
        b = a;                             // b = 1
        a = c;                             // a = 2
        System.out.println("After Swapping");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }


}
