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
class CArgoPlane extends AeroPlane2
{
    @Override
    public void takeoff() {
        System.out.println("CarrgoPlane requires longer runway");
    }

    @Override
    public void fly() {
        System.out.println("Carg");
    }
}

public class LaunchPoly1 {
}
