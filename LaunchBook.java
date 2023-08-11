package  Constructor;
class Books
{
    private int pgNo;
    void setpgNo(int x)
    {
        pgNo=x;
    }
    int getpgNo()
    {
        return pgNo;
    }
}
public class LaunchBook {
    public static void main(String[] args){
        Books b=new Books();
       // b.pgNo=100;
        //System.out.println(b.pgNo);
        b.setpgNo(100);
        System.out.println(b.getpgNo());

    }
}
