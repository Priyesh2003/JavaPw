package Inheritance;
abstract class Aeroplane3
{
    abstract public void takeoff();
    abstract public void fly();
    abstract public void alert();
    public void landing()
    {
        System.out.println("AeroPlane landing");
    }

}

class CargoPlane3 extends Aeroplane3
{
    @Override
    public void takeoff() {
        System.out.println("Cargoplane require longer runway");
    }

    @Override
    public void fly() {
        System.out.println("Cargoplane flies at lower height");
    }
    public void alert()
    {
        System.out.println("Alert....");
    }
}

class PassengerPlane extends Aeroplane3
{
    @Override
    public void takeoff() {
        System.out.println("Passengerplane requires medium runway");
    }

    @Override
    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}

class FighterPlane extends Aeroplane3
{
    @Override
    public void takeoff() {
        System.out.println("FighterPlane reqiures small runway");
    }

    @Override
    public void fly() {
        System.out.println("FighterPlane flies at higher height");
    }
}

public class LaunchAbs
{
    public static void main(String[] args)
    {
       Aeroplane3 ref1=new CargoPlane3();
        ref1.takeoff();
        ref1.fly();
       ref1.landing();
       ref1.alert();

        Aeroplane3 ref2=new PassengerPlane();
        ref2.takeoff();
       ref2.fly();
       ref2.landing();

       Aeroplane3 ref3=new FighterPlane();
               ref3.takeoff();
        ref3.fly();
        ref3.landing();
    }
}
