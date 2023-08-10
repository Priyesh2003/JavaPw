package Constructor;
class Demo
{
    private  int a;
    private int b;
    //Demo()
   // {

  //  }
    Demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    public Demo()
    {
        System.out.println("Zero parameterized constructor by programmer");
    }
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Launch2 {
    public static void main(String[] agrs)
    {
        Demo d=new Demo();
        d.disp();
      // d.add();
        Demo d2=new Demo(10,20);
        d2.disp();
    }
}
