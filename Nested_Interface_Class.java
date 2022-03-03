import java.util.*;
public class Nested_Interface_Class implements Nested_Interface.inner
{
    public void Innermethod()
    {
        System.out.println("Enter Number You Want");
        Scanner num= new Scanner(System.in);
        int n;
        n=num.nextInt();
        int t1=0,t2=1;
        System.out.println("First "+n+" Terms are ");
        for(int i=1;i<=n;i++)
        {     
                System.out.print(t1+ " + ");
        
                int sum=t1+t2;
                t1=t2;
                t2=sum;
        }
        System.out.println("\n");
        System.out.println("Printing from nested interface method");
    }
    public static void  main(String args[])
    {
        Nested_Interface.inner obj= new Nested_Interface_Class();
        obj.Innermethod();
    }
}
