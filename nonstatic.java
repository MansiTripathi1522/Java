//2. we cannot access a non-static variable in a static method.
import java.lang.*;
public class nonstatic {
    int a=10;
    static void method()
{
   // System.out.println(a);
}
public static void main(String[] args)
{
  /*  staticvariable obj= new staticvariable();
    obj.method();*/
    System.out.println("We can't access non-static variable in satic method");
}
}
