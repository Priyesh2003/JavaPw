@FunctionalInterface
interface  Truck
{
    void drive();
}
public class LambdaDemo {
    public static void main(String[] args)
    {
        Truck obj=()->System.out.println("Driving.....");
        obj.drive();
    }
}
