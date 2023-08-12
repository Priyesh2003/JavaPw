package Inheritance;
class AeroPlane
{
    public void takeoff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is flying");
    }
}
class CargoPlane extends AeroPlane
{
    @Override
    public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane extends AeroPlane
{
    public void fly() {
        System.out.println("CargoPlane flies at Medium height");
    }
}
public class Inheritance5 {
    public static void main(String[] args)
    {
       CargoPlane cp=new CargoPlane();
       cp.takeoff();
       cp.fly();

       PassengerPlane pp=new PassengerPlane();
       pp.takeoff();
       pp.fly();
    }
}
