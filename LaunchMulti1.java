import java.util.Scanner;

public class LaunchMulti1 {
    public static void main(String[] args)
    {
        System.out.println("Calculation TAsk Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=sc.nextInt();

        System.out.println("Please enter the second number");
        int num2=sc.nextInt();

        int result=num1+num2;
        System.out.println(result);

        System.out.println("Calculation TAsk End");
        System.out.println("*************************************************");
        System.out.println("Printing * task started");
        for (int i=0;i<4;i++)
        {
            System.out.println("*");
        }


        System.out.println("Printing * task ended");
        System.out.println("**************************************************");
        System.out.println("Displaying important message task");
        for (int i=0;i<3;i++)
        {
            System.out.println("Focus is important for master skills");
        }
        System.out.println("Displaying import message task ended");
        System.out.println("**************************************************");
    }
}
