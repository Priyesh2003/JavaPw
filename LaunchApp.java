package Inheritance;

import java.util.Scanner;

class Square1
{
    float length;
    float area;
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
    public void disp()
    {
        System.out.println("Area of Square is: "+area);
    }
}
class Rectangle1
{
    float length;
    float breadth;
    float area;
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
    public void disp()
    {
        System.out.println("Area of Rectangle is: "+area);
    }
}
class Circle1
{
    float radius;
    float area;
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
    public void disp()
    {
        System.out.println("Area of Circle is: "+area);
    }
}


public class LaunchApp {
    public static void main(String[] args)
    {
        Square1 SQ=new Square1();
        SQ.input();
        SQ.compute();
        SQ.disp();

        Rectangle1 RA=new Rectangle1();
        RA.input();
        RA.compute();
        RA.disp();

        Circle1 C=new Circle1();
        C.input();
        C.compute();
        C.disp();

    }
}
