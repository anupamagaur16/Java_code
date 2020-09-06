//Write a code that prints the numbers between 2,000 and 3,000 i.e (2000<=number<3000), which are divisible by 8 but not by 6.
//        (Hint: apply Boolean condition - number%8==0 && number%6!=0)
//        Note:
//        1) Please print all the even numbers on the same line, such as:
//        2000 2008 2024 ...
//        and not on different lines, such as:
//        2000
//        2008
//        2024
//        ...
//        2) Please include number 2000<=number<3000.

package com.company;

import java.util.*;

public class ForLoop {
    public static void main(String[] args){
        int i;
        for(i = 2000; i < 3000; i++)
        {
            if(i % 8 == 0 && i % 6 != 0)
            {
                System.out.print(i+" ");
            }

        }
    }
}
