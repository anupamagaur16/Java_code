package com.company;

public class TableOneToTwenty {
    public static void main(String[] args)
    {
        for(int j=1; j<=20; j++)
        {
            int tableOf = j;
            for(int i=1;i<=20;i++)
            {
                System.out.print(tableOf * i + "  ");
            }
            System.out.println();
        }
    }
}
