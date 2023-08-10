class Student
{
    private int age;
    private String name;
    public void setData1(int age)
    {
        this.age = age;
    }
    public void setData2(String name)
    {
        this.name = name;
    }
    public  void show()
    {
        System.out.println(name + " " + age);
    }
}
public class Demo1 {
    public static void main(String[] args)
    {

        Student obj = new Student();
        Student obj1 = new Student();
        obj.setData1(18);
        obj1.setData1(23);
        obj.setData2("Navin");
        obj1.setData2("Kiran");
        obj.show();
        obj1.show();
    }
}
