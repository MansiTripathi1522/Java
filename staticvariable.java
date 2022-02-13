import java.lang.*;
public class staticvariable {
static int a=10;
void method()
{
    System.out.println(a);
}
public static void main(String[] args)
{
    staticvariable obj= new staticvariable();
    obj.method();
    System.out.println("We can access static variable in non satic method");
}
}
