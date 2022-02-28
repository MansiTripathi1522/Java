abstract class Base{
    abstract void fun();
    void add()
    {
        System.out.println("This is Add Method");
    }
}
//Class 2
class derived extends Base{
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}
public class Absract_class
{
    public static void main(String[] args)
    {
        //Base b= new derived();
        derived d=new derived();
        d.fun();
        d.add();
    }
}
