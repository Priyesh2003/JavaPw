package Inheritance;

import java.util.Scanner;

abstract class Shape
{
    float area;
    abstract public void input();
    abstract public  void compute();
    public void disp()
    {
        System.out.println("The area is: "+area);
    }
}
class Square extends Shape
{
    float length;
    public void input()
    {
        System.out.println("Calculation of Square App: ");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length of sqaure:");
        length= scan.nextFloat();
    }
    public void compute()
    {
        area=length*length;
    }

}
class Rectangle extends Shape
{
    float length;
    float breadth;
    public void input()
    {
        System.out.println("Calculation of Rectangle App: ");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length of Rectangle:");
        length= scan.nextFloat();
        System.out.println("Please enter the breadth of Rectangle:");
        breadth= scan.nextFloat();
    }
    public void compute()
    {
        area=length*breadth;
    }

}
class Circle extends Shape
{
    float radius;
    public void input()
    {
        System.out.println("Calculation of Circle App: ");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the length of Circle:");
        radius= scan.nextFloat();
    }
    public void compute()
    {
        area=3.14f*radius*radius;
    }

}
class Geometry
{
    public void poly(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
}

public class LauchEffApp {
    public static void main(String[] args)
    {
        Square sq=new Square();
        Rectangle RA=new Rectangle();
        Circle C=new Circle();

        Geometry g=new Geometry();
        g.poly(sq);
        g.poly(RA);
        g.poly(C);
    }
}
