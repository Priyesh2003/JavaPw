class Student1
{
   private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public  void show()
    {
        System.out.println(name + " " + age);
    }
}
public class Demo {
    public static void main(String[] args)
    {

        Student1 obj = new Student1();
        Student1 obj1 = new Student1();
        obj.setAge(18);
        obj1.setAge(23);
        obj.setName("Navin");
        obj1.setName("Kiran");
        String studName= obj.getName();
        System.out.println(studName);
        int studAge=obj.getAge();
        System.out.println(studAge);
        String stuName= obj1.getName();
        System.out.println(stuName);
        int stuAge=obj1.getAge();
        System.out.println(stuAge);
    }
}
