import javax.management.RuntimeErrorException;

public class Finally {
    static void method1()
    {
        try{
            System.out.println("\n Method 1");
            throw new RuntimeException("Example 1");
        }
      /*  catch(RuntimeException e)
        {
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());
        }*/
        finally{
            System.out.println("finally block of method 1");
        }
    }
    static void method2()
    {
        try{
            System.out.println("\n Method 2");
            return ;
        }
        finally{
            System.out.println("finally block of method 2");
        }
    }
    static void method3()
    {
        try{
            System.out.println("\n Method 3");
            //System.out.println(5/0);
        }
        finally{
            System.out.println("finally block of method 3");
        }
    }
        public static void main(String args[])
        {
            try{
                method1();
            }
            catch(Exception e)
            {
                System.out.println("Exception caught");
            }
            method3();
            method2();
           
        }
}
