//Create two objects s1 & s2 of 'Square' class given below. Assign them the side-length of 10f and 20f respectively,
//        and print their areas in separate lines.

package com.Abstraction;

public class ObjectsOfSquareClass {
    public static void main(String[] args)
    {
        Square s1 = new Square();
        s1.length = 10.0f;
        Square s2 = new Square();
        s2.length = 20.0f;
        System.out.println("Area of Square1 : " + s1.area());
        System.out.println("Area of Square2 : " + s2.area());
    }
}
class Square{
    public float length;
    public float area()
    {
        return length * length;
    }
}
