public class ExceptionDemo1 {
    public static void main(String[] args)
    {
        int num1=6;
        int num2=2;
        int result=0;
        int values[]={4,7,2,9};

        try {
            result=num1/num2;
            System.out.println(values[7]);
        }
        catch (Exception e)
        {
            System.out.println("You can not divide the number by zero"+e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
