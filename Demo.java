import java.util.Stack;

@FunctionalInterface
interface C
{
    void show();
}
interface X
{
    void abc();
}
class B implements C,X
{
    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void abc() {
        System.out.println("in abc");
    }
}
public class Demo {
    public static void main(String[] args)
    {
        C obj=new B();
        obj.show();
    }
}
