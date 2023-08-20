package in.ineuron.main;

import java.util.Scanner;

public class NoDuplicateS {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of string for which you would like to remove the duplicate string");
        String S1= scan.next();
        String S2="";
        for (int i=0;i<S1.length();i++)
        {
            boolean isDuplicate=false;
            for (int j=i+1;j<S1.length();j++)
            {
                if (S1.charAt(i)==S1.charAt(j))
                {
                    System.out.println("This are the duplicate char "+S1.charAt(i));
                    isDuplicate=true;
                }
            }
            if (isDuplicate=false)
            {
                S2=S2+S1.charAt(i);
            }
        }
        System.out.print(S2);
    }
}
