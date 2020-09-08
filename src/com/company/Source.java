package com.company;

import java.util.*;
import java.io.IOException;

public class Source {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            thirdMaxInteger(arr);
        }

        // Method to find the third maximum integer in the array
        static void thirdMaxInteger(int[] arr)
        {
            // Write your code here

            int temp,total;
            total = arr.length;

            for (int i = 0; i < total; i++)
            {
                for (int j = i + 1; j < total; j++)
                {
                    if (arr[i] > arr[j])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            if(total<=3||arr[0]>=arr[total-1])
            {
                System.out.println("The array doesn't have a third maximum element");
            }
            else
            {

                System.out.println(arr[total-3]);
            }

        }
    }