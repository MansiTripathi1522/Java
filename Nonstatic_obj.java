//3. Accessing a non-static variable in a static method using object.
import java.lang.*;
public class Nonstatic_obj
{
int a=10;
public static void name(String[] args)
{
    System.out.println("We can access non-static variable in satic method using obect");
    System.out.println(Nonstatic_obj.a);
}
}