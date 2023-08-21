@FunctionalInterface
interface D
{
    void show();
    default void config()
    {
        System.out.println("in config");
    }
    static void xyz()
    {
        System.out.println("in xyz");
    }
}
class P implements D
{
    @Override
    public void show() {
        System.out.println("in show");
    }
}
public class Java8Fe {
    public static void main(String[] args)
    {D.xyz();
        D obj=new P();
        obj.config();
    }
}
