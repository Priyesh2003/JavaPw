package Inheritance;
class human
{
    private  String name;
    int age;
    human()
    {
        System.out.println("Human class constructor");
    }
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends human
{
    void disp()
    {
        System.out.println("The age is:"+age);
        //System.out.println("The name is:"+name);
    }
}
public class Inheritance1 {
    public static void main(String[] args)
    {
        Student st= new Student();
        st.sleep();
        st.disp();
    }
}
