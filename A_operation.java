import java.util.*;
import java.io.*;
public class A_operation implements arithmetic
{
    int a,b,s;
   
    Scanner obj=new Scanner(System.in);

    public void add()
    {   
        System.out.println("Enter Any Two Numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        s=a+b;
        System.out.println("Sum of "+a+" and "+b+ " is: "+s);
    }
    public void mul()
    {   
        System.out.println("Enter Any Two Numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        s=a*b;
        System.out.println("Product of "+a+" and "+b+ " is: "+s);
    }
    public void div()
    {   
        System.out.println("Enter Any Two Numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        s=a/b;
        System.out.println("Division of "+a+" and "+b+ " is: "+s);
    }
    public static void main(String [] args)
    {
        A_operation obj= new A_operation();
        obj.add();
        obj.mul();
        obj.div();
        
    }
}
