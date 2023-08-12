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
class PassengerPlane extends AeroPlane
{
    @Override
    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries Passenger");
    }
}
class CargoPlane  extends AeroPlane
{
    public void fly() {
        System.out.println("CargoPlane flies at Lower height");
    }
    public void carryGoods()
    {
      System.out.println("CargoPlane carries goods");
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
