package Inheritance;

class Parent{
    public void methodOne()
    {
        System.out.println("methodone from parent");
    }
    class Child extends Parent{

        public void methodtwo()
        {
            System.out.println("methodTwo from child");
        }
    }
}
public class TestApp {
    public static void main(String[] args)
    {
        Parent p=new Parent();
        p.methodOne();

        Parent.Child c=new Parent.Child();
        c.methodOne();;
        c.methodtwo();

        Parent p1=new Parent.Child();
        p1.methodOne();
        //p1.methodtwo();
    }
}
