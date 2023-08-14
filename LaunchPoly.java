package Inheritance;
class AeroPlane1
{
    public void takeoff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane1 extends AeroPlane1
{
    @Override
    public void takeoff() {
        System.out.println("CargoPlane requires longer runway");
    }

    @Override
    public void fly() {
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane extends AeroPlane1
{
    @Override
    public void takeoff() {
        System.out.println("PassengerPlane requires medium size runway");
    }

    @Override
    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class LaunchPoly {
    public static void main(String[] args)
    {
        CargoPlane1 cp=new CargoPlane1();
        cp.takeoff();
        cp.fly();

        PassengerPlane pp=new PassengerPlane();
        pp.fly();
        pp.takeoff();
    }
}
