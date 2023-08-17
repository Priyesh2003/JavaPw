package Inheritance;

class AeroPlane2
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
class CargoPlane2 extends AeroPlane2
{
    @Override
    public void takeoff() {
        System.out.println("CargoPlane requires longer runway");
    }

    @Override
    public void fly() {
        System.out.println("Cargoplane flies at lower height");
    }
}
class PassengerPlane2 extends AeroPlane2
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
class FighterPlane2 extends AeroPlane2
{
    @Override
    public void takeoff() {
        System.out.println("Fighterplane requires smaller runway");
    }

    @Override
    public void fly() {
        System.out.println("Fighterplane flies at higher height");
    }
}
class Airport
{
    public void poly(AeroPlane2 ref)
    {
        ref.fly();
        ref.takeoff();

        System.out.println(".......");
    }
}

public class LaunchPoly1 {
    public static void main(String[] args)
    {
        CargoPlane2 cp=new CargoPlane2();
        PassengerPlane2 pp=new PassengerPlane2();
        FighterPlane2 fp=new FighterPlane2();

        Airport a=new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

       //off( cp.fly();
       // cp.takeoff();

        //pp.fly();
        //pp.takeoff();

        //fp.fly();
        //fp.takeoff();
    }
}
