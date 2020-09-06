package AbstractionDemo;

//import java.util.*;

public class Employee
{
	public static class superclass
    {
        static void print()
        {
            System.out.println("superclass.");
        }
    }
    public static class subclass extends superclass
    {
        static void print()
        {
            System.out.println("subclass.");
        }
    }
 
    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        superclass.print();
        superclass.print();
    }
}