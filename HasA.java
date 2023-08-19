package Inheritance;
class Student
{
    private  Heart h;
    public Student(Heart A)
    {
        this.h=h;
    }
    public void setH(Heart h)
    {
        this.h=h;
    }
    public void call()
    {
        h.heartbeat();
    }
}
class Heart
{
   public void heartbeat()
   {
       System.out.println("Heart is Important");
   }
}

public class HasA {
    public static void main(String[] args)
    {
        Heart h=new Heart();
        Student S=new Student(h);
        S.setH(h);
    }
}
