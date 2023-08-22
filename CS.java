interface Computer
{
    void compileCode();
    default void config()
    {

    }
}
class Laptop implements Computer
{
    @Override
    public void compileCode() {
        System.out.println("you got 5 error");
    }
}
class Developer
{
    public void BuildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compileCode();
    }
}
public class CS {
    public static void main(String[] args)
    {
        Computer obj=new Laptop();
        //Laptop obj=new Laptop();
        Developer dev=new Developer();
        dev.BuildApp(obj);
    }
}
