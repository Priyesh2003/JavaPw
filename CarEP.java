package Inheritance;
class car //target class
{
    private  Engine eng;
    public car(Engine eng)
    {
        this.eng=eng;
    }
    public void start()
    {
        eng.Enginestart();
    }
}
class Engine //dependence class
{
    public void Enginestart()
    {
        System.out.println("Car started");
    }

}

public class CarEP {
    public static void main(String[] args)
    {
        Engine e=new Engine();
        car c=new car(e);
        c.start();
    }
}
