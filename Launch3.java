package  Constructor;

class Student4
{
    private String name;
    private int age;

    public Student4()
    {
        System.out.println("Default Constructor is called");
        name="Rohan";
        age=18;
    }
    Student4(String name)
    {
        this.name=name;
        age=19;
    }
    Student4(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Launch3
{
    public static void main(String[] args)
    {
        Student4 st=new Student4();
        st.disp();

        Student4 stud=new Student4("RAHUL");
        stud.disp();
    }
}
